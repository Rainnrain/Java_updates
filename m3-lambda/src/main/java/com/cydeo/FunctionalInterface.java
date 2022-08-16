package com.cydeo;

import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {

        Predicate<Integer> lesserthan= i->i<18;

        System.out.println(lesserthan.test(20));
    }
}
