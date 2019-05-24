package cn.dynasty.zt.portal.provider.impl;

import cn.dynasty.zt.portal.model.Hello;
import cn.dynasty.zt.portal.provider.mapper.HelloMapper;
import cn.dynasty.zt.portal.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.apache.tomcat.jni.Thread;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: HelloServiceImpl
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-12 10:35
 **/
//注册为dubbo服务
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloMapper helloMapper;


    //@HystrixCommand
    @Override
    public Hello sayHello(Hello hello) {
        //int i = 1/0;
        Hello result = helloMapper.sayHello(hello);
        return result;
    }


    @Override
    public Hello sayGoodbye(Hello hello) {
        //int i = 1/0;
        hello.setMsg("sayGoodbye");
        return hello;
    }
}
