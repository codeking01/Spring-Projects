package com.codeking.ssm.controller;

import com.codeking.ssm.pojo.Employee;
import com.codeking.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : codeking
 * @create : 2022/11/27 20:53
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    @ResponseBody
    public List<Employee> getEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping(value = "/employee/page/{pageNum}")
    public String getEmployeeList(@PathVariable("pageNum") Integer pageNum, Model model) {
        PageInfo<Employee> page=employeeService.getEmployeeList(pageNum);
        model.addAttribute("page", page);
        return "employee_list";
    }
}
