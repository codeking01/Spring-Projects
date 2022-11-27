package com.codeking.ssm.mapper;

import com.codeking.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author : codeking
 * @create : 2022/11/27 21:07
 */
public interface EmployeeMapper {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();
}
