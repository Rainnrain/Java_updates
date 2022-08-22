package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> number= Arrays.asList(2,4,2,10,23);

        Optional <String> empty= Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());

        System.out.println(Optional.of(number).isPresent());

        number.stream().filter(x->x>100).forEach(System.out::println);



    //ifPresent
        Optional <Integer> bigNumber= number.stream().filter(x->x>100).findAny();
        bigNumber.ifPresent(System.out::println);

        // get
      //  System.out.println(bigNumber.get());

    //orElse
        System.out.println(bigNumber.orElse(99));

    }
}
