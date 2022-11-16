package com.codeking.beans;

/**
 * @author : codeking
 * @date : 2022/11/16 16:05
 */
public class Person {
    private String name;
    public Person() {
        System.out.println("第一步，调用无参构造器..");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步，调用set方法..");
    }
    //创建执行的初始化的方法
    public void initMethod() {
        System.out.println("第三步,initMethod");
    }

    //创建执行的销毁的方法
    public void destroyMethod() {
        System.out.println("第五步 执行销毁的方法");
    }
}
