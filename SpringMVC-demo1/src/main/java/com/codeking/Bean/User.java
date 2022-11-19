package com.codeking.Bean;

import java.util.Arrays;

/**
 * @author : codeking
 * @date : 2022/11/19 20:06
 */
public class User {
    private String user_name;
    private String password;
    private String[] hobby;

    public User() {
    }

    public User(String user_name, String password, String[] hobby) {
        this.user_name = user_name;
        this.password = password;
        this.hobby = hobby;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
