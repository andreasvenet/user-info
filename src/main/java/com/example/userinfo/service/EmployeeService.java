package com.example.userinfo.service;

import com.example.userinfo.model.Employee;
import com.example.userinfo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Employee employee){
        if(!employee.equals(null)) {
            employeeRepository.deleteById(employee.getId());
        }
    }

    public Optional<Employee> getEmployeeById(Integer id){
        return employeeRepository.findById(id);
    }

    public List<Employee> getAll(){

        return (List<Employee>) employeeRepository.findAll();
    }
}
