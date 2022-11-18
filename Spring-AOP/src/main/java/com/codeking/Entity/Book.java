package com.codeking.Entity;

import org.springframework.lang.Nullable;

/**
 * @author : codeking
 * @date : 2022/11/17 20:33
 */
public class Book {
    private String BookName;
    private String BookStatus;
    //@Nullable 注解可以使用在方法上面，属性上面，参数上面，表示方法返回可以为空，属性值可以为空，参数值可以为空
    @Nullable
    private String BookId;

    public String getUserId() {
        return BookId;
    }

    public void setUserId(String userId) {
        BookId = userId;
    }

    public String getUserName() {
        return BookName;
    }

    public void setUserName(String userName) {
        BookName = userName;
    }

    public String getUserStatus() {
        return BookStatus;
    }

    public void setUserStatus(String userStatus) {
        BookStatus = userStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "UserId='" + BookId + '\'' +
                ", UserName='" + BookName + '\'' +
                ", UserStatus='" + BookStatus + '\'' +
                '}';
    }
}
