package com.sg.sb.controller;

import com.sg.sb.model.Employee;
import com.sg.sb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping(value="/employee/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping(value = "/employee/save")
    public String saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);

        return "success";
    }
}
