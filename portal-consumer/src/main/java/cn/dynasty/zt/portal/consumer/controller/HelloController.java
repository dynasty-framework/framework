package cn.dynasty.zt.portal.consumer.controller;

import cn.dynasty.zt.portal.model.Hello;
import cn.dynasty.zt.portal.service.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName: HelloController
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-12 11:21
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {


    @Reference
    private HelloService helloService;


    @RequestMapping(value = "/sayHello", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    /*@RequestBody
        作用：
          i) 该注解用于读取Request请求的body部分数据，使用系统默认配置的HttpMessageConverter进行解析，然后把相应的数据绑定到要返回的对象上；
          ii) 再把HttpMessageConverter返回的对象数据绑定到 controller中方法的参数上。*/
    @ResponseBody
    /*@ResponseBody
        作用：
            该注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，写入到Response对象的body数据区。*/
    public String sayHello(@RequestBody Hello hello) {
        return helloService.sayHello(hello);
    }




}
