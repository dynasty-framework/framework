package cn.dynasty.zt.test.dao.base;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author zhaotao
 * @Description sqlSession获取的抽象类
 * @Date 10:51 2019/4/15
 * @Param
 * @return
 **/
public abstract class MyBatisSupport {

    private SqlSessionTemplate sqlSessionTemplate;

	protected SqlSessionTemplate getSqlSessionTemplate() {
		return this.sqlSessionTemplate;
	}

}
