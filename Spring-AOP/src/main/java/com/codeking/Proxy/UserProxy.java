package com.codeking.Proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author : codeking
 * @date : 2022/11/17 15:49
 */
/* 可以注解开启 就不用配置了
<!-- 开启 Aspect 生成代理对象-->
<aop:aspectj-autoproxy></aop:aspectj-autoproxy>
 */
//增强类
@Component
@Aspect //生成代理对象
//@Order(0)
//有多个增强类多同一个方法进行增强，设置增强类优先级
// 在增强类上面添加注解 @Order(数字类型值)，数字类型值越小优先级越高
public class UserProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* com.codeking.Dao.UserDao.addUser(..))")
    public void commonBefore() {
    }

    //@Before(value = "execution(* com.codeking.Dao.UserDao.addUser(..))")
    @Before(value = "commonBefore()")
    public void Before() {
        //前置通知
        System.out.println("before......");
    }

    //环绕通知
    @Around(value = "execution(* com.codeking.Dao.UserDao.addUser(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    }

    @AfterReturning(value = "execution(* com.codeking.Dao.UserDao.addUser(..))")
    public void After() {
        //后置通知
        System.out.println("AfterReturning......");
    }

    // 最终通知
    @After(value = "execution(* com.codeking.Dao.UserDao.addUser(..))")
    public void after() {
        System.out.println("after.........");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.codeking.Dao.UserDao.addUser(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing.........");
    }


}
