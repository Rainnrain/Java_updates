package com.cydeo.taskCollectors;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsExamples {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier): is used to create a Collection using collector
        List<Integer> numberList=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);


        Set<Integer> numberSet=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);
        //toList(): returns a Collector interface that gathersthe input data into a new set

        List<Integer> numberList2=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());

        //toSet() : returns a Collector interface that gathers the input data into a new set

        Set<Integer> numberSet2=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());

        //toMap(Function, function) : returns a Collector interface that gathers the input data into a new map
        Map<String, Integer> dishMap=DishData.getAll().stream()
                .collect((Collectors.toMap(Dish::getName, Dish::getCalories)));

        System.out.println(dishMap);

        //summingInt (ToIntFunction) : returns a Collector that produces the sum of an Integer value function
        Integer sum=DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //counting(): returns a Collector that counts the number of the elements
        Long evenCount= numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        //averagingInt (ToIntFunction) : returns the average of the integers passed values
        Double calorieAverage=DishData.getAll().stream()
                .collect(Collectors.averagingDouble(Dish::getCalories));

        System.out.println(calorieAverage);

        //joining(): is used to join various elements of a character of string array into a single object

        List<String> courses = Arrays.asList("Java", "JS", "TS");
        String str=courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        // partitioningBy(): is used to partition a stream of objects(or a set of elements(based on na given predicate).
        Map<Boolean, List<Dish>> veggieDish=DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);
        // We seperated the dishes based on if they are veggie or not, true or false

        //groupingBy(); is used for grouping objects by some property and storing results in a Map instance

       Map<Type, List<Dish>> dishType= DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);




    }
}
