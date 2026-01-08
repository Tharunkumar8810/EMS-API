package com.manage.EMS.service;

import com.manage.EMS.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(int id, Employee employee);
    void deleteEmployee(int id);

    // Search methods
    List<Employee> searchByDepartment(String department);
    List<Employee> searchByName(String name);
}
