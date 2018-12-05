package com.canxue.basemb.common.base;


import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * 基础mapper定义,可以自己重写，也可加入自己的方法
 * 2016年7月12日 下午3:01:23
 *
 * @param <T>  操作的对象类型
 * @param <ID> id
 */
public interface BaseMapper<T, ID extends Serializable> {

    public int insert(T t);

    public int insertBatch(List<T> t);

    public int update(T t);

    public int deleteById(@Param("id") ID id);

    public int deleteBatchById(List<ID> ids);

    public T findOne(Map<String, Object> parameter);

    public T findById(@Param("id") ID id);

    public List<T> queryAll(Map<String, Object> parameter);

    public List<T> queryAll(T t);

    public List<T> queryPage(Map<String, Object> parameter);

    public List<T> queryPage(T t);

    int count(Map<String, Object> parameter);

}
