package com.codeking.beans;

/**
 * @author : codeking
 * @date : 2022/11/15 21:10
 */
public class Order {
    private String o_name;
    private String o_address;

    public Order(String o_name, String o_address) {
        this.o_name = o_name;
        this.o_address = o_address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "o_name='" + o_name + '\'' +
                ", o_address='" + o_address + '\'' +
                '}';
    }
}
