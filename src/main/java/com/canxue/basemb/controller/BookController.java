package com.canxue.basemb.controller;

import com.canxue.basemb.common.base.BaseController;
import com.canxue.basemb.entity.Student;
import com.canxue.basemb.service.BookService;
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
@RequestMapping("book")
public class BookController extends BaseController {


    @Resource
    BookService bookService;

    /**
     * 查询接口
     *
     * @param student
     * @return
     */
//    @GetMapping("getPage")
////    public String getPage(Student student) {
////        List<Student> students = Book.queryPage(student);
////        return toJson(students);
////    }
////
////    /**
////     * 新增一个student对象
////     *
////     * @param student
////     * @return
////     */
////    @GetMapping("add")
////    public String add(Student student) {
////        int insert = Book.insert(student);
////        return toJson("添加成功");
////    }
////
////    /**
////     * 修改student对象
////     *
////     * @param student
////     * @return
////     */
////    @GetMapping("update")
////    public String update(Student student) {
////        int update = Book.update(student);
////        return toJson("添加成功");
////    }


}
