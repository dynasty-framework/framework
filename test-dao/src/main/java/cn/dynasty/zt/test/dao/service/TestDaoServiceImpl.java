package cn.dynasty.zt.test.dao.service;

import cn.dynasty.zt.test.common.model.TestDO;
import cn.dynasty.zt.test.dao.mapper.TestMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: UserDao
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-15 11:16
 **/
@Service
public class TestDaoServiceImpl implements TestDaoService{

    @Autowired
    private TestMapper testMapper;


    @Override
    public TestDO findOne(TestDO test) {
        return testMapper.findOne(test);
    }
}
