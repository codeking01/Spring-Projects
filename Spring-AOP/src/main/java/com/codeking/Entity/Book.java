package com.codeking.Entity;

/**
 * @author : codeking
 * @date : 2022/11/17 20:33
 */
public class Book {
    public String BookId;
    public String BookName;
    public String BookStatus;

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
