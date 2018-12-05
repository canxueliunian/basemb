package com.canxue.basemb.service.impl;

import com.canxue.basemb.common.base.BaseMapper;
import com.canxue.basemb.common.base.impl.AbstractService;
import com.canxue.basemb.entity.Student;
import com.canxue.basemb.mapper.StudentMapper;
import com.canxue.basemb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author canxue
 * @create2018-11-30-23:50
 */
@Service
public class StudentServiceImpl extends AbstractService<Student, Long> implements StudentService {
    @Resource
    StudentMapper studentMapper;


    @Autowired
    public void setBaseMapper() {
        super.setBaseMapper(studentMapper);
    }
}
