package org.example;

@FunctionalInterface
public interface MyFunctionalInterface {

    public void abstractMethod();

    //public void abstractMethod2();

    default public void default1(){
        System.out.println("default method 1");
    }

    default public void default2(){
        System.out.println("default method 2");
    }

    static public void staticMethod1(){
        System.out.println("Static Method 1");
    }

    static public void staticMethod2(){
        System.out.println("Static Method 1");
    }
}
