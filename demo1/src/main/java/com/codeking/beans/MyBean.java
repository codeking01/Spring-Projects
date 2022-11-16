package com.codeking.beans;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author : codeking
 * @date : 2022/11/16 15:57
 */
public class MyBean implements FactoryBean<bookList> {

    public bookList getObject() throws Exception {
        bookList list = new bookList();
        list.setB_name("java");
        return list;
    }

    public Class<?> getObjectType() {
        return null;
    }

    public boolean isSingleton() {
        return false;
    }
}
