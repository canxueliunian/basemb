package com.canxue.basemb.common.base.impl;

import com.canxue.basemb.common.base.BaseMapper;
import com.canxue.basemb.common.base.BaseService;
import com.canxue.basemb.common.exection.ServiceException;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * service层基类
 *
 * @param <T>  操作对象类型
 * @param <ID> id
 * @author Carry Xie
 * 2016年7月12日 下午3:03:43
 */
public class AbstractService<T, ID extends Serializable> implements BaseService<T, ID> {

    private BaseMapper<T, ID> baseMapper;

    public void setBaseMapper(BaseMapper<T, ID> baseMapper) {
        this.baseMapper = baseMapper;
    }

    @Override
    public int insert(T t) {
        try {
            return baseMapper.insert(t);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public List<T> queryPage(T t) {
        return baseMapper.queryPage(t);
    }


    @Override
    public int insertBatch(List<T> t) {
        try {
            if (t.size() == 0)
                return 0;
            return baseMapper.insertBatch(t);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public int deleteById(ID id) {
        try {
            return baseMapper.deleteById(id);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }


    @Override
    public int update(T t) {
        try {
            return baseMapper.update(t);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }


    @Override
    public int deleteBatchById(List<ID> ids) {
        try {
            return baseMapper.deleteBatchById(ids);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public T find(Map<String, Object> parameter) {
        return baseMapper.findOne(parameter);
    }

    @Override
    public T findById(ID id) {
        return baseMapper.findById(id);
    }


    @Override
    public List<T> queryListAll(Map<String, Object> parameter) {
        return baseMapper.queryAll(parameter);
    }

    @Override
    public List<T> queryListByPage(Map<String, Object> parameter) {
        return baseMapper.queryPage(parameter);
    }

    @Override
    public int count(Map<String, Object> parameter) {
        return baseMapper.count(parameter);
    }


}
