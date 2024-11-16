package Mongodb.Example.MongodbDemo.Services;

import java.util.List;

import Mongodb.Example.MongodbDemo.Model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employee,long id);
    void deleteEmployee(long id);
}
