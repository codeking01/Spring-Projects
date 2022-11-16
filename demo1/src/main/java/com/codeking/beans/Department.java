package com.codeking.beans;

/**
 * @author : codeking
 * @date : 2022/11/16 13:25
 */
public class Department {
    private String d_id;
    private String d_name;


    public void setD_id(String d_id) {
        this.d_id = d_id;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_id='" + d_id + '\'' +
                ", d_name='" + d_name + '\'' +
                '}';
    }
}
