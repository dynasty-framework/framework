package cn.dynasty.zt.portal.provider.impl;

import cn.dynasty.zt.portal.model.Hello;
import cn.dynasty.zt.portal.provider.mapper.HelloMapper;
import cn.dynasty.zt.portal.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;
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


    @Override
    public String sayHello(Hello hello) {
        Hello result = helloMapper.sayHello(hello);
        return result.getMsg();
    }
}
