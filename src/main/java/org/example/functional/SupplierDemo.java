package org.example.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo{
//    @Override
//    public String get() {
//        return "Hello World";
//    }

    public static void main(String[] args) {
//        Supplier<String> supplier = new SupplierDemo();
//        System.out.println(supplier.get());

         Supplier<String> supplier = () -> "Hello!";
        // System.out.println(supplier.get());

         List<String> list =  Arrays.asList("abc","xys", "def","ghi");
         System.out.println(list.stream().findAny().orElseGet(() -> "Nothing in the list"));

    }
}
