package com.codeking.Dao;

import org.springframework.stereotype.Repository;

/**
 * @author : codeking
 * @date : 2022/11/17 15:48
 */

@Repository
public class UserDao {
    public void addUser(String user){
        //int id = 10/0;
        System.out.println("添加"+user);
    }
}
