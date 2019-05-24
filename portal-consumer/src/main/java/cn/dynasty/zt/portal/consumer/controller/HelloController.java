package cn.dynasty.zt.portal.consumer.controller;

import cn.dynasty.zt.portal.model.Hello;
import cn.dynasty.zt.portal.service.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName: HelloController
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-12 11:21
 **/
@RestController
@RequestMapping("/hello")
@Slf4j
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
    @HystrixCommand(fallbackMethod = "onError")//接口调用失败后，调用onError方法
    public Hello sayHello(@RequestBody Hello hello) {
        log.info("aaa");
        return helloService.sayHello(hello);
    }

    /**
     * 如果fallback方法的参数和原方法参数个数不一致，则会出现FallbackDefinitionException: fallback method wasn't found
     * fallback方法的返回值与原方法的返回值也要一致
     */
    public Hello onError(Hello hello) {
        String msg = "Error!!!" + hello.toString();
        hello.setMsg(msg);
        return hello;
    }



}
