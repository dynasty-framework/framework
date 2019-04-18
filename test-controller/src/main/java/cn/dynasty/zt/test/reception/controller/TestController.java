package cn.dynasty.zt.test.reception.controller;

import cn.dynasty.zt.test.common.model.TestDO;
import cn.dynasty.zt.test.server.service.TestService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

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
    public TestDO getData(@RequestBody TestDO test) {
        return testService.getData(test);
    }


}
