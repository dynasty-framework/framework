package cn.dynasty.zt.portal.consumer.controller;

import cn.dynasty.zt.portal.model.Hello;
import cn.dynasty.zt.portal.service.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName: HelloController
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-12 11:21
 **/
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {


    @Reference
    private HelloService helloService;


    @RequestMapping(value = "/sayTest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "onError")//接口调用失败后，调用onError方法
    public Hello sayTest(@RequestBody Hello hello) {
        log.info("aaa");
        return helloService.sayHello(hello);
    }

    /**
     * 如果fallback方法的参数和原方法参数个数不一致，则会出现FallbackDefinitionException: fallback method wasn't found
     * fallback方法的返回值与原方法的返回值也要一致
     */
    public Hello onError(Hello hello) {
        String msg = "Error!!!" + hello.getMsg();
        hello.setMsg(msg);
        return hello;
    }


    @RequestMapping(value = "/byeTest", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "onError")//接口调用失败后，调用onError方法
    public Hello sayGoodbye(@RequestBody Hello hello) {
        log.info("aaa");
        return helloService.sayGoodbye(hello);
    }



}
