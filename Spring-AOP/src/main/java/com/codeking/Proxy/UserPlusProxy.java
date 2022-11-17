package com.codeking.Proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author : codeking
 * @date : 2022/11/17 16:19
 */

@Component
@Aspect
//@Order(1)
public class UserPlusProxy {
    @Before(value = "execution(* com.codeking.Dao.UserDao.addUser(..))")
    public void Before() {
        //前置通知
        System.out.println("UserPlusProxy... before......");
    }
}
