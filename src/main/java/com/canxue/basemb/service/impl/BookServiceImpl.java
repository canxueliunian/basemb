package com.canxue.basemb.service.impl;

import com.canxue.basemb.common.base.BaseMapper;
import com.canxue.basemb.common.base.impl.AbstractService;
import com.canxue.basemb.entity.Book;
import com.canxue.basemb.entity.Student;
import com.canxue.basemb.mapper.BookMapper;
import com.canxue.basemb.service.BookService;
import com.canxue.basemb.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author canxue
 * @create2018-11-30-23:50
 */
@Service
public class BookServiceImpl extends AbstractService<Book, Long> implements BookService {
    @Resource
    BookMapper bookMapper;

    @Override
    public void setBaseMapper(BaseMapper<Book, Long> baseMapper) {
        super.setBaseMapper(bookMapper);
    }
}
