package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        System.out.println("************        PREDICATE          *************");

        Predicate<Integer> lesserthan= i->i<18;
        System.out.println(lesserthan.test(20));

        System.out.println("************        CONSUMER          *************");

        Consumer<Integer> display= i-> System.out.println(i);
        display.accept(24);

        System.out.println("************      BI  CONSUMER          *************");
        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(3,4);

        System.out.println("************      FUNCTION          *************");

        Function <String, String> fun=s-> "Hello " +s;
        System.out.println(fun.apply("Cydeo"));

        System.out.println("************    BI  FUNCTION          *************");

        BiFunction<Integer, Integer, Integer> func= (a,b)-> a*b;
        System.out.println(func.apply(10,2));

        System.out.println("************    SUPPLIER         *************");

        Supplier <Double> randomValue=()->Math.random();
        System.out.println(randomValue.get());

    }
}
