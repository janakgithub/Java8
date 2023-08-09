package org.example.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static List<Employee> checkForTax(String input) {
        //List<Employee> emp = EmployeeDatabase.getEmployees().stream().filter(e->e.getSalary()>5000).collect(Collectors.toList());

//        if(input.equalsIgnoreCase("tax")){
//           return EmployeeDatabase.getEmployees().stream().filter(e->e.getSalary()>5000).collect(Collectors.toList());
//        }
//        else{
//          return  EmployeeDatabase.getEmployees().stream().filter(e->e.getSalary()<=5000).collect(Collectors.toList());
//        }

        //Ternary operator
        return input.equalsIgnoreCase("tax") ?
                EmployeeDatabase.getEmployees().stream().filter(e -> e.getSalary() > 5000).collect(Collectors.toList())
                :
                EmployeeDatabase.getEmployees().stream().filter(e -> e.getSalary() <= 5000).collect(Collectors.toList());


    }

    public static void main(String[] args) {
        //StreamDemo streamDemo = new StreamDemo();
        //streamDemo.checkForTax().stream().forEach(e-> System.out.println(e));

        System.out.println(checkForTax("tax"));
    }
}
