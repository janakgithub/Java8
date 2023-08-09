package org.example.stream.sortMap;

import org.example.example.Employee;

import java.util.*;

public class SortMapEx {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("seven", 7);
        map.put("five", 5);
        map.put("three", 3);
        map.put("nine", 9);

        //TRADITIONAL

//        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getKey().compareTo(o2.getKey());
//            }
//        });
//
//        for(Map.Entry<String, Integer> x: entries){
//            System.out.println(x.getKey() +" : "+ x.getValue());
//        }

        //LAMBDA

//        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
//        Collections.sort(entries,(o1,o2)->o2.getKey().compareTo(o1.getKey()));
//        entries.stream().forEach(System.out::println);

        //Stream

        //map.entrySet().stream().sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey())).forEach(System.out::println);

       // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        // map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    //CUSTOM Objects

//        Map<Employee, Integer> map1 = new TreeMap<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getSalary() - o2.getSalary();
//            }
//        });

      Map<Employee, Integer> map1 = new TreeMap<>((o1, o2) -> o1.getSalary() - o2.getSalary());

        map1.put(new Employee(44, "Janak", "IT", 5600),54);
        map1.put(new Employee(44, "Jiaa", "HR", 3400),33);
        map1.put(new Employee(44, "Baby", "Defence", 9800),67);
        map1.put(new Employee(44, "Nancy", "Moth", 7700),21);


        map1.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println);


       // System.out.println(map1);


    }
}
