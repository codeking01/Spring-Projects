package com.codeking.Dao;

import com.codeking.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author : codeking
 * @date : 2022/11/17 20:29
 */

@Repository
public class BookDaoImpl implements BookDao {
    //注入 JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void bookAdd(Book book) {
        //1 创建 sql 语句
        String sql = "insert into `book` values(?,?,?)";
        //2 调用方法实现
        Object[] args = {"1", "张三","良好"};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
}
