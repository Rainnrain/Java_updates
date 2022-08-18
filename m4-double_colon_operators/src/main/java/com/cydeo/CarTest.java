package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        // Zero arg constructor
        Supplier<Car> c1 = () -> new Car();
        c1.get().getMake();

        Supplier<Car> c2 = Car :: new;

        //One Argument Constructor

        Function<Integer, Car> c3= model-> new Car(model);
        Function <Integer, Car> c4= Car::new;
        c4.apply(2022);

        //Two Argument Constructor

        BiFunction<String, Integer, Car> c5= Car::new;
        Car Toyota=c5.apply("Toyota", 2022);
        System.out.println(Toyota.getMake()+" "+Toyota.getModel());

    }
}
