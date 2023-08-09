package org.example.stream.sort.sortList;

import org.example.example.Employee;
import org.example.example.EmployeeDatabase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class SortAList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(55);
        list.add(31);
        list.add(76);
        list.add(22);

        //Traditional
        Collections.sort(list);
        //System.out.println(list);
        //lambda
        //premitive data type
        //list.stream().sorted().forEach(e-> System.out.println(e)); //descending
        //list.stream().sorted(Comparator.reverseOrder()).forEach(e-> System.out.println(e)); //ascending

        // custom object

        List<Employee> employees = EmployeeDatabase.getEmployees();
        //traditional way
//       Collections.sort(employees, new Comparator<Employee>() {
//           @Override
//           public int compare(Employee o1, Employee o2) {
//               return o1.getName().compareTo(o2.getName());
//           }
//       });
//        System.out.println(employees);

        //Lambda

//        Collections.sort(employees, (e1,e2)->e1.getName().compareTo(e2.getName()));
//        System.out.println(employees);

        //STREAM API

       // employees.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);

        //employees.stream().sorted(Comparator.comparing(e->e.getName())).forEach(System.out::println);

        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

    }
}
