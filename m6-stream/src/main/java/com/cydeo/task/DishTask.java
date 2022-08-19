package com.cydeo.task;

public class DishTask {

    public static void main(String[] args) {

        // Print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .map(dish->dish.getName())
                .forEach(System.out::println);

        // Print the length of the name of each dish
        System.out.println("-------------------------");

        DishData.getAll().stream()
                .map(dish->dish.getName().length())
                .forEach(System.out::println);

        //Print three high caloric dish names (>300)

        System.out.println("-------------------------");

        DishData.getAll().stream()
                .filter(dish->dish.getCalories()>300)
                .map(dish->dish.getName())
                .limit(3).forEach(System.out::println);

        // Print all the dishes names that are below 400 calories in sorted

        System.out.println("-------------------------");

        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .map(dish->dish.getName())
                .sorted()
                .forEach(System.out::println);
    }
}
