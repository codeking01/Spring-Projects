package com.codeking.Dao;

import com.codeking.Entity.Book;
import org.springframework.context.annotation.Bean;

/**
 * @author : codeking
 * @date : 2022/11/17 20:27
 */
public interface BookDao{
    void bookAdd(Book book);
}
