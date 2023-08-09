package org.example.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{

//    @Override
//    public boolean test(Integer x) {
//        return x<4;
//    }

    public static void main(String[] args) {
//        Predicate<Integer> predicateDemo = new PredicateDemo();
//        System.out.println(predicateDemo.test(1));

        Predicate<Integer> predicateDemo = x -> x%2 == 0;
        System.out.println(predicateDemo.test(13));

        List<Integer> list = Arrays.asList(12, 45, 55, 33, 67, 44);
        list.stream().filter(x -> x%2 != 0).forEach(e -> System.out.println(e));

    }

}
