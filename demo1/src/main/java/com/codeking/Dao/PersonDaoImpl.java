package com.codeking.Dao;

import org.springframework.stereotype.Repository;

/**
 * @author : codeking
 * @date : 2022/11/16 20:35
 */
@Repository(value="PersonDaoImpl1")
public class PersonDaoImpl implements PersonDao {
    public void add() {
        System.out.println("PersonDaoImpl add..");
    }
}
