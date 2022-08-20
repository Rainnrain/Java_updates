package com.cydeo.q1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplePrintFormatter colorAndWeightPrinter = apple-> System.out.println("Apple is "+ apple.getColor()+
                "\n"+"weight is "+ apple.getWeight()+"gr.");

        printAppleDetails(Arrays.asList(new Apple(223, Colors.YELLOW)), colorAndWeightPrinter);

        printAppleDetails(Arrays.asList(new Apple(223, Colors.YELLOW)),



        new ApplePrintFormatter() {
            @Override
            public void print(Apple apple) {
                if (apple.getWeight() >= 500)
                    System.out.println("This is a big apple");
                else
                    System.out.println("This is not a big apple");
            }
        });

    }

    static void printAppleDetails(List<Apple> apples, ApplePrintFormatter applePrintFormatter){
        for(Apple apple : apples){
            applePrintFormatter.print(apple);
        }
    }
}
