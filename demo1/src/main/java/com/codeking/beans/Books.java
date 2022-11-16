package com.codeking.beans;

import java.util.List;

/**
 * @author : codeking
 * @date : 2022/11/16 13:50
 */
public class Books {
    private List list;

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Books{" +
                "list=" + list +
                '}';
    }
}
