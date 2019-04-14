package cn.dynasty.zt.test.server.provider;

import cn.dynasty.zt.portal.model.Hello;
import cn.dynasty.zt.portal.service.HelloService;
import cn.dynasty.zt.test.dao.mapper.TestMapper;
import cn.dynasty.zt.test.server.model.TestDO;
import cn.dynasty.zt.test.server.service.TestService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @ClassName: TestServiceImpl
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-14 13:23
 **/
//使用dubbo的注解
@Service
public class TestServiceImpl implements TestService {

    @Reference
    private TestMapper testMapper;

    @Reference
    private HelloService helloService;



    @Override
    public String getData(TestDO test) {
        return testMapper.getData(test);
    }

    @Override
    public String sayHello(Hello hello) {
        return helloService.sayHello(hello);
    }
}
