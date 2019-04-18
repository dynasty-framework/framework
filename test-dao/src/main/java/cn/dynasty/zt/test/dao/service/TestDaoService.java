package cn.dynasty.zt.test.dao.service;


import cn.dynasty.zt.test.common.model.TestDO;
import cn.dynasty.zt.test.common.model.User;

public interface TestDaoService{

    TestDO findOne(TestDO test);

    Integer insert(User user);

    Integer insertRoleUser(User user);
}
