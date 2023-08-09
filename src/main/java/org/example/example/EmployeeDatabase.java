package org.example.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(44, "Janak", "IT", 5600));
        employees.add(new Employee(14, "Niki", "CSE", 239));
        employees.add(new Employee(53, "Jiaa", "HR", 8475));
        employees.add(new Employee(86, "Baby", "Print", 4900));
        employees.add(new Employee(186, "Nikka", "Doc", 5000));
        return employees;
    }
}
