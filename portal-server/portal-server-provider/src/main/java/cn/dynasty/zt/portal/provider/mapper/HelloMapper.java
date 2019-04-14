package cn.dynasty.zt.portal.provider.mapper;

import cn.dynasty.zt.portal.model.Hello;
import com.alibaba.dubbo.config.annotation.Service;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Service
public interface HelloMapper {

    Hello sayHello(Hello hello);
}
