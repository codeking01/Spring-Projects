package com.codeking.Service;

import com.codeking.Dao.BookDao;
import com.codeking.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : codeking
 * @date : 2022/11/17 20:26
 */

@Service
public class BookService {
    //注入 dao
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.bookAdd(book);
    }


}
