package com.codeking.beans;

/**
 * @author : codeking
 * @date : 2022/11/16 13:26
 */
public class Employee {
    private String E_name;
    private String gender;
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setE_name(String e_name) {
        E_name = e_name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "E_name='" + E_name + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                '}';
    }
}
