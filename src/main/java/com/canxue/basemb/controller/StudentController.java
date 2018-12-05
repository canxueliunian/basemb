package com.canxue.basemb.controller;

import com.canxue.basemb.common.base.BaseController;
import com.canxue.basemb.common.page.PageQO;
import com.canxue.basemb.entity.Student;
import com.canxue.basemb.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author canxue
 * @create2018-11-30-23:49
 */
@RestController
@RequestMapping("student")
public class StudentController extends BaseController {


    @Resource
    StudentService studentService;

    /**
     * 查询接口
     *
     * @return
     */
    @GetMapping("getPage")
    public String getPage(PageQO<Student> pageQO) {
        try {
            Page<Student> page = PageHelper.startPage(pageQO.getPageNum(), pageQO.getPageSize(), pageQO.getOrderBy());
            Student student = pageQO.getCondition();
            studentService.queryPage(student);
            return toJson(page);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "asa";
    }

    /**
     * 新增一个student对象
     *
     * @param student
     * @return
     */
    @GetMapping("add")
    public String add(Student student) {
        int insert = studentService.insert(student);
        return toJson("添加成功");
    }

    /**
     * 修改student对象
     *
     * @param student
     * @return
     */
    @GetMapping("update")
    public String update(Student student) {
        int update = studentService.update(student);
        return toJson("添加成功");
    }


}
