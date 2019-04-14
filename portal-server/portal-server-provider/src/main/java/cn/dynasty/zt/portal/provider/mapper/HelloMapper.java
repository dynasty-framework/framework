package cn.dynasty.zt.portal.provider.mapper;

import cn.dynasty.zt.portal.model.Hello;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloMapper {

    Hello sayHello(Hello hello);
}
