package com.codeking.Controller;

import com.codeking.Bean.Employee;
import com.codeking.Dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

/**
 * @author : codeking
 * @date : 2022/11/21 13:30
 */
@Controller
public class restfulTestController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/restIndex")
    public String getIndex() {
        return "restIndex";
    }

    //  查询所有的数据
    @GetMapping(value = "/employee")
    public String getEmployees(Model model) {
        Collection<Employee> employeeCollection = employeeDao.getAll();
        model.addAttribute("employee_list", employeeCollection);
        return "employee_list";
    }

    // 删除数据
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/employee";
    }

    // 保存数据
    @RequestMapping(value = "/employee", method = {RequestMethod.POST,RequestMethod.PUT})
    public String saveEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    // 添加数据
    @GetMapping("/toAdd")
    public String toAdd() {
        return "employee_add";
    }

    // 修改数据
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public String getEmployeeById(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee_list",employee);
        return "employee_update";
    }
}
