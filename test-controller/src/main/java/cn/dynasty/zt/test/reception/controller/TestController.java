package cn.dynasty.zt.test.reception.controller;

import cn.dynasty.zt.test.common.model.TestDO;
import cn.dynasty.zt.test.common.model.User;
import cn.dynasty.zt.test.server.service.TestService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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


    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> insertUser(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        try{
            Integer insert = testService.insertUser(user);
            if(insert != null && insert > 0) {
                map.put("code", 1);
                return map;
            }else {
                map.put("code", 0);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


}
