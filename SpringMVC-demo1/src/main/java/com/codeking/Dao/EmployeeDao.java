package com.codeking.Dao;

import com.codeking.Bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : codeking
 * @date : 2022/11/21 13:35
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    // 手动模拟数据
    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1));
        employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", 1));
        employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", 0));
        employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0));
        employees.put(1005, new Employee(1005, "E-EE", "ee@163.com", 1));
    }

    private static Integer initId = 1006;

    public void save(Employee employee) {
        if (employee.getId() == null) { //添加
            employee.setId(initId++);
        }
        // 保存数据
        employees.put(employee.getId(), employee);
    }

    // 查询数据
    public Collection<Employee> getAll() {
        return employees.values();
    }

    // 根据id查询
    public Employee get(Integer id) {
        // 根据id查到字典对应的value
        return employees.get(id);
    }

    // 删除数据
    public Employee delete(Integer id) {
        return employees.remove(id);
    }
}
