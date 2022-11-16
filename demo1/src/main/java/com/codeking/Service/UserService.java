package com.codeking.Service;

import com.codeking.Dao.UserDao;

/**
 * @author : codeking
 * @date : 2022/11/15 21:40
 */
public class UserService {
    //创建 UserDao 类型属性，生成 set 方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add(){
        System.out.println("add 方法执行...");
        userDao.update();
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}
