package com.cydeo.Tasks;

import java.util.ArrayList;
import java.util.List;

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


                prettyPrintApple(appleList, new AppleHeavy());


                ApplePredicate appleCol=(apple)-> "A "+ apple.getAppleColor()+" apple";

                // Created ApplePredicate obj that implements the abstract method of the interface
                // This mean we don't need to implement the method in the child class, it can be done
                // in the lambda expression. This obj can be passed in the method.

                ApplePredicate appleweight=apple->"An apple of "+ apple.getAppleWeight()+" g";

                prettyPrintApple(appleList, appleweight);
        }



        public static  void  prettyPrintApple(List<Apple> a, ApplePredicate applePredicate) {
                for (Apple apple : a) {
                        String result = applePredicate.test(apple);
                        System.out.println(result);
                }
        }
}