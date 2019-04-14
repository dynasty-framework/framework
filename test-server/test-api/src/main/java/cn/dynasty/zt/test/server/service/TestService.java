package cn.dynasty.zt.test.server.service;


import cn.dynasty.zt.test.server.model.TestDO;

/*
 * @Author zhaotao
 * @Description 测试dubbo框架搭建
 * @Date 13:24 2019/4/14
 * @Param
 * @return
 **/
public interface TestService {

    String getData(TestDO test);

}
