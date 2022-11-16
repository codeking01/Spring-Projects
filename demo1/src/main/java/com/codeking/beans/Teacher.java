package com.codeking.beans;

/**
 * @author : codeking
 * @date : 2022/11/16 16:34
 */
public class Teacher {
    private String name;
    private Course courses;

    public Teacher() {
    }

    public Teacher(String name, Course courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public Course getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
