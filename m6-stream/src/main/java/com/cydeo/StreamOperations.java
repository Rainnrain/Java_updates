package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4, 2);

      //  list.forEach(System.out::println);
        System.out.println("Filter");
        //Filter
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        //DISTINCT
        System.out.println("Distinct");

       list.stream()
               .filter(i->i%2==0)
               .distinct().forEach(System.out::println);

       //LIMIT
        System.out.println("Limit");

        list.stream()
                .filter(i->i%2==0)
                .limit(1)
                .forEach(System.out::println);
    }
}
