package org.example.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Janak");
        list.add("Jagga");
        list.add("Mani");
        list.add("Nancy");

        //list.stream().forEach(e -> System.out.println(e));

        //FILTER LIST
//        for(String s : list){
//            if(s.startsWith("J")){
//                System.out.println(s);
//            }
//        }
//
//
//        list.stream().filter(s->s.startsWith("J")).forEach(e-> System.out.println(e));

        Map<Integer,  String> map = new HashMap<>();
        map.put(12,"l");
        map.put(21,"v");
        map.put(32,"t");
        map.put(55,"c");
        map.put(6,"m");

//
//       // map.forEach((a,b) -> System.out.println(a +" : "+b));
//        map.entrySet().stream().forEach(e-> System.out.println(e));
//
//
//        //---INTERNAL WORKING OF FOREACH---
//
//        Consumer<String> consumer = (x) -> System.out.println(x);
//        for(String x: list) {
//            consumer.accept(x);
//        }


        //FILTER MAP

        map.entrySet().stream().filter(e->e.getKey()%2 == 0).forEach(e-> System.out.println(e));




    }
}
