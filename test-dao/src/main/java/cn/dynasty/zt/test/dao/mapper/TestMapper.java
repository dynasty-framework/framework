package cn.dynasty.zt.test.dao.mapper;

import cn.dynasty.zt.test.server.model.TestDO;
import com.alibaba.dubbo.config.annotation.Service;
import org.apache.ibatis.annotations.Mapper;

@Service
@Mapper
public interface TestMapper {

    String getData(TestDO test);
}
