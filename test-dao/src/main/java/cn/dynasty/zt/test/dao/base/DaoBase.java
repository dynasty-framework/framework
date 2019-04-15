package cn.dynasty.zt.test.dao.base;

import java.io.Serializable;
import java.util.List;

/**
 * @Author zhaotao
 * @Description 数据库连接的基础接口，T为实现类所对应的实体类，KEY是该实体类的主键类型
 * @Date 10:49 2019/4/15
 * @Param
 * @return
 **/
public interface DaoBase<T, KEY extends Serializable> {

    /**
     * @Author zhaotao
     * @Description 新增接口
     * @Date 10:02 2019/4/15
     * @Param [parameter]
     * @return java.lang.Integer
     **/
    Integer insert(Object parameter);

    /*
     * @Author zhaotao
     * @Description 自定义新增接口
     * @Date 10:05 2019/4/15
     * @Param [statement  mapper中SQL的方法名
     *         parameter  请求参数
     * @return java.lang.Integer
     **/
    Integer insertByStatement(String statement, Object parameter);


    /**
     * @Author zhaotao
     * @Description 删除接口
     * @Date 10:02 2019/4/15
     * @Param [parameter]
     * @return java.lang.Integer
     **/
    Integer delete(Object parameter);


    /*
     * @Author zhaotao
     * @Description 自定义删除接口
     * @Date 10:05 2019/4/15
     * @Param [statement  mapper中SQL的方法名
     *         parameter  请求参数
     * @return java.lang.Integer
     **/
    Integer deleteByStatement(String statement, Object parameter);


    /**
     * @Author zhaotao
     * @Description 更新接口
     * @Date 10:02 2019/4/15
     * @Param [parameter]
     * @return java.lang.Integer
     **/
    Integer update(Object parameter);


    /*
     * @Author zhaotao
     * @Description 自定义更新接口
     * @Date 10:05 2019/4/15
     * @Param [statement  mapper中SQL的方法名
     *         parameter  请求参数
     * @return java.lang.Integer
     **/
    Integer updateByStatement(String statement, Object parameter);


    /**
     * @Author zhaotao
     * @Description 查询列表接口
     * @Date 10:02 2019/4/15
     * @Param [parameter]
     * @return java.lang.Integer
     **/
    List<T> findList(Object parameter);


    /*
     * @Author zhaotao
     * @Description 自定义查询接口
     * @Date 10:05 2019/4/15
     * @Param [statement  mapper中SQL的方法名
     *         parameter  请求参数
     * @return java.lang.Integer
     **/
    List<T> findListByStatement(String statement, Object parameter);

    /**
     * @Author zhaotao
     * @Description 获取指定对象信息接口
     * @Date 10:02 2019/4/15
     * @Param [parameter]
     * @return java.lang.Integer
     **/
    T findOne(Object parameter);



}
