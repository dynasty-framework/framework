package cn.dynasty.zt.test.dao.base;

/**
 * @ClassName: DaoBaseImpl
 * @description: TODO
 * @author: zhaotao
 * @create: 2019-04-15 10:14
 **/

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class DaoBaseImpl<T, KEY extends Serializable> extends MyBatisSupport implements DaoBase<T, KEY>{

    public static final String INSERT = "insert";
    public static final String DELETE = "delete";
    public static final String UPDATE = "update";
    public static final String FINDONE = "findOne";
    public static final String FINDLIST= "findList";

    /**
     * @Author zhaotao
     * @Description 实现类T的类型
     **/
    private Class<T> persistentClass;


    /**
     * @Author zhaotao
     * @Description 获取实现类T的类型
     **/
    public DaoBaseImpl() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }


    /**
     * 获取命名空前前缀，与mapper.xml中的命名空间一致,
     * 实现类必须实现该方法，定义自己的命名空间
     * @return
     */
    public abstract String getNameSpace();


    /**
     * sql 是mapper中SQL的id，返回命名空间.SQL_ID
     * SQLSession就可直接调用对应的SQL语句
     * @return
     */
    public String getStatement(String sql) {
        return getNameSpace() + "." + sql;
    }


    /**
     * @Author zhaotao
     * @Description 新增接口
     * @Date 11:13 2019/4/15
     * @Param [parameter]
     * @return java.lang.Integer
     **/
    @Override
    public Integer insert(Object parameter) {
        String statement = this.getStatement(INSERT);
        return getSqlSessionTemplate().insert(statement, parameter);
    }


    /**
     * @Author zhaotao
     * @Description 自定义新增接口
     * @Date 11:13 2019/4/15
     * @Param [statement, parameter]
     * @return java.lang.Integer
     **/
    @Override
    public Integer insertByStatement(String statement, Object parameter) {
        statement = this.getStatement(statement);
        return getSqlSessionTemplate().insert(statement, parameter);
    }


    /*
     * @Author zhaotao
     * @Description 删除接口
     * @Date 11:13 2019/4/15
     * @Param [parameter]
     * @return java.lang.Integer
     **/
    @Override
    public Integer delete(Object parameter) {
        String statement = this.getStatement(DELETE);
        return getSqlSessionTemplate().delete(statement, parameter);
    }


    /**
     * @Author zhaotao
     * @Description 自定义删除接口
     * @Date 11:13 2019/4/15
     * @Param [statement, parameter]
     * @return java.lang.Integer
     **/
    @Override
    public Integer deleteByStatement(String statement, Object parameter) {
        statement = this.getStatement(statement);
        return getSqlSessionTemplate().delete(statement, parameter);
    }


    /*
     * @Author zhaotao
     * @Description 更新接口
     * @Date 11:13 2019/4/15
     * @Param [parameter]
     * @return java.lang.Integer
     **/
    @Override
    public Integer update(Object parameter) {
        String statement = this.getStatement(UPDATE);
        return getSqlSessionTemplate().update(statement, parameter);
    }


    /**
     * @Author zhaotao
     * @Description 自定义更新接口
     * @Date 11:12 2019/4/15
     * @Param [statement, parameter]
     * @return java.lang.Integer
     **/
    @Override
    public Integer updateByStatement(String statement, Object parameter) {
        statement = this.getStatement(statement);
        return getSqlSessionTemplate().update(statement, parameter);
    }


    /*
     * @Author zhaotao
     * @Description 查询列表
     * @Date 11:12 2019/4/15
     * @Param [parameter]
     * @return java.util.List<T>
     **/
    @Override
    public List<T> findList(Object parameter) {
        String statement = this.getStatement(FINDLIST);
        return (List<T>) getSqlSessionTemplate().selectList(statement, parameter);
    }

    /**
     * @Author zhaotao
     * @Description 查询指定数据
     * @Date 11:12 2019/4/15
     * @Param [parameter]
     * @return T
     **/
    @Override
    public T findOne(Object parameter) {
        String statement = this.getStatement(FINDONE);
        return (T) getSqlSessionTemplate().selectList(statement, parameter);
    }


    /*
     * @Author zhaotao
     * @Description 自定义查询列表
     * @Date 11:12 2019/4/15
     * @Param [statement, parameter]
     * @return java.util.List<T>
     **/
    @Override
    public List<T> findListByStatement(String statement, Object parameter) {
        statement = this.getStatement(statement);
        return (List<T>) getSqlSessionTemplate().selectOne(statement, parameter);
    }

}
