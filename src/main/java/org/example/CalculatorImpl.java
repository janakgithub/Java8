package org.example;

interface Calculator{
   // void switchOn();
    //void sum(int x);

    int substract(int i, int j);
}


public class CalculatorImpl {

    public void switchOn() {
        System.out.println("Switched On!");
    }


    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
//        calculator.switchOn();
//        Calculator calculator1 = () -> System.out.println("Switched On!!");
//        calculator1.switchOn();

//        Calculator cal = (x) -> System.out.println(x);
//        cal.sum(10);

        Calculator cal = (x,y) ->{
            if(y<x){
               return x-y;
            }
            else {
                throw new RuntimeException("Error!");
            }
        };
        int z = cal.substract(12,25);
        System.out.println(z);
    }
}
