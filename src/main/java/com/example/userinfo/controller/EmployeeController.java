package com.example.userinfo.controller;

import com.example.userinfo.model.Employee;
import com.example.userinfo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping(path = "/employees", consumes = "application/json", produces = "application/json")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping(path="/employees/{id}", produces = "application/json")
    public Optional<Employee> getEmployee(@PathVariable Integer id) throws ResourceNotFoundException {
        return employeeService.getEmployeeById(id);
    }

}
