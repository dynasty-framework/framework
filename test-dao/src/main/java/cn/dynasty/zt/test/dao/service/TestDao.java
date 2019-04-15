package cn.dynasty.zt.test.dao.service;

import cn.dynasty.zt.test.dao.mapper.TestMapper;
import cn.dynasty.zt.test.server.model.TestDO;
import com.alibaba.dubbo.config.annotation.Service;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: UserDao
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-15 11:16
 **/
@Service
@Mapper
public class TestDao implements TestDaoService{

    @Autowired
    TestMapper testMapper;

   /* @Override
    public String getNameSpace() {
        return "mybatis.mapper.TestDao";
    }*/


    @Override
    public TestDO findOne(TestDO test) {
        return testMapper.findOne(test);
    }
}
