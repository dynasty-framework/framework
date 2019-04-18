package cn.dynasty.zt.test.dao.mapper;

import cn.dynasty.zt.test.common.model.TestDO;
import cn.dynasty.zt.test.common.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    TestDO findOne(TestDO test);

    Integer insert(User user);

    Integer insertRoleUser(User user);

}
