package org.example.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo{

//    public void accept(Integer integer) {
//        System.out.println(integer);
//    }

    public static void main(String[] args) {

        Consumer<Integer> con = (x) -> System.out.println(x);
        //con.accept(10);

        List<Integer> list = Arrays.asList(1,3,5,6,22,7,8);
        //list.stream().forEach(con);
        list.stream().forEach(x->System.out.println("Printinng: "+x));
    }
}
