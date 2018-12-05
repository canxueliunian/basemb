package com.canxue.basemb.common.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * service层接口
 *
 * @param <T>  泛型对象
 * @param <ID> ID
 * @author Carry Xie 2016年7月12日 下午3:03:19
 */
public interface BaseService<T, ID extends Serializable> {

    /**
     * 插入对象
     *
     * @param t 插入的对象
     * @return int 返回影响的行数
     */
    public int insert(T t);

    public List<T> queryPage(T t);

    /**
     * 批量插入对象
     *
     * @param t 插入的对象
     * @return int 返回影响的行数
     */
    public int insertBatch(List<T> t);

    /**
     * 批量删除
     *
     * @param ids 删除的id
     * @return int 返回影响的行数
     */
    public int deleteBatchById(List<ID> ids);

    /**
     * deleteById 根据id删除
     *
     * @param id id
     * @return int 返回影响的行数
     */
    public int deleteById(ID id);



    /**
     * 更新对象
     *
     * @param t 更新的对象
     * @return int 返回影响的行数
     */
    public int update(T t);

    /**
     * 根据参数查询对象
     *
     * @param parameter 查询参数map
     * @return T 返回查询的对象
     */
    public T find(Map<String, Object> parameter);

    /**
     * 根据id查询对象
     *
     * @param id id
     * @return T 返回查询的对象
     */
    public T findById(ID id);




    /**
     * 根据参数查询全部对象
     *
     * @param parameter 查询参数map
     * @return List<T> 返回查询的对象集合
     */
    public List<T> queryListAll(Map<String, Object> parameter);

    /**
     * 根据分页参数查询对象
     *
     * @param parameter 查询参数map
     * @return List<T> 返回查询的对象集合
     */
    public List<T> queryListByPage(Map<String, Object> parameter);



    /**
     * 根据参数查询对象总条数
     *
     * @param parameter 查询参数map
     * @return int 返回查询的对象总条数
     */
    int count(Map<String, Object> parameter);

}
