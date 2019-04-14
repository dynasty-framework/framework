package cn.dynasty.zt.test.reception.controller;

import cn.dynasty.zt.test.server.model.TestDO;
import cn.dynasty.zt.test.server.service.TestService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-14 18:05
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Reference
    private TestService testService;


    @RequestMapping(value = "/getData", method = RequestMethod.POST)
    @ResponseBody
    public String getData(TestDO test) {
        return testService.getData(test);
    }


}
