package com.codeking.beans;

/**
 * @author : codeking
 * @date : 2022/11/16 13:51
 */
public class bookList {
    private String b_name;

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    @Override
    public String toString() {
        return "bookList{" +
                "b_name='" + b_name + '\'' +
                '}';
    }
}
