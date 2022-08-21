package com.cydeo.task3;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    // ALL MATCH
    public static void main(String[] args) {

        System.out.println("All Match");
        boolean isHealthy= DishData.getAll().stream().allMatch(dish->dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("Any Match");

        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("None Match");
        boolean isHealthy2= DishData.getAll().stream().noneMatch(dish->dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("Find Any");
        Optional<Dish> dish=DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("Find First");
        Optional<Dish> dish2=DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish.get());

// PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());


        List<String> list1= Arrays.asList("Johnny", "David", "Jack", "Duke", "Jill", "Danny","Julia", "Jenish", "Divya");
        List<String> list2= Arrays.asList("Johnny", "David", "Jack", "Duke", "Jill", "Danny","Julia", "Jenish", "Divya");

        Optional<String> findFirst=list1.stream().parallel().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny=list2.stream().parallel().filter(s->s.startsWith("J")).findAny();

        System.out.println(findFirst);
        System.out.println(findAny);

        //MIN AND MAX
        System.out.println("Min");
        Optional<Dish> dishMinCal=DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMinCal.get());

        System.out.println("Max");
        Optional<Dish> dishMaxCal= DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMaxCal.get());








    }


}
