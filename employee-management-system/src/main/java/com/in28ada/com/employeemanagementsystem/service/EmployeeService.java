package com.in28ada.com.employeemanagementsystem.service;

import com.in28ada.com.employeemanagementsystem.modal.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> employees() {
        return List.of(
                new Employee("Yeaniva", "Bayoh",25),
        new Employee("Calla", "Kamara",30),
        new Employee("Abu", "Kanu",35),
        new Employee("Mariama", "Mansaray",50),
        new Employee("Bintu", "Marrah",15)
        );
    }

}
