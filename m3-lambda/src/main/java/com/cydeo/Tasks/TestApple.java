package com.cydeo.Tasks;

import com.sun.jdi.InterfaceType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestApple {
        public static void main(String[] args) {

                List<Apple> appleList = new ArrayList<>();

                Apple apple1 = new Apple(123, AppleColor.RED);
                Apple apple2 = new Apple(523, AppleColor.GREEN);
                Apple apple3 = new Apple(423, AppleColor.RED);
                Apple apple4 = new Apple(623, AppleColor.GREEN);
                Apple apple5 = new Apple(1123, AppleColor.RED);

                appleList.add(apple1);
                appleList.add(apple2);


             //   prettyPrintApple(appleList, new AppleHeavy());


             //   ApplePredicate appleCol=(apple)-> {
             //           String ans= apple.getAppleWeight()>200?"heavy":"light";
             //          return "A "+ ans+" "+apple.getAppleColor()+" apple";
             //   };

                // Created ApplePredicate obj that implements the abstract method of the interface
                // This mean we don't need to implement the method in the child class, it can be done
                // in the lambda expression. This obj can be passed in the method.

               // ApplePredicate appleweight=apple->"An apple of "+ apple.getAppleWeight()+" g";

             //   prettyPrintApple(appleList, appleCol);

                Consumer <Apple> appleWeight= mutzu-> System.out.println("An apple of "+ mutzu.getAppleWeight()+"g");

               Consumer<Apple> appleColor= apple-> {
                       System.out.print(apple.getAppleWeight() > 200 ? "A heavy " : "A light ");
                       System.out.println(apple.getAppleColor()+" apple");
               };
//appleWeight.accept(apple1);

                prettyPrintApple(appleList, appleColor);
                prettyPrintApple(appleList, appleWeight);

        }

        public static <T> void  prettyPrintApple(List<T> appleList, Consumer <T> a ) {
                for (T apple : appleList) {
                      //  String result = applePredicate.test(apple);
                        a.accept(apple);
                       // System.out.println(result);
                }
        }
}