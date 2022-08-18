package com.cydeo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        //inventory.forEach(apple-> System.out.println(apple));


       // List<Apple> heavyApple=filterApples( new AppleHeavyPredicate(), inventory);
      //  List<Apple> greenApple= filterApples(new AppleGreenColorPredicate(), inventory);



        ApplePredicate weightApple=apple-> apple.getWeight()>200;
        ApplePredicate color= apple-> apple.getColor().equals(Color.GREEN);
        // Convert to functional interface
       Predicate<Apple> yum= a->a.getColor().equals(Color.RED);
        Predicate<Apple> bigYum=a-> a.getWeight()>200;

        System.out.println(filterApples(yum, inventory));
        System.out.println(filterApples(bigYum, inventory));
    }

    private static List<Apple> filterApples(Predicate <Apple> apple, List <Apple> inventory){

        List<Apple> result = new ArrayList<>();
        for(Apple each: inventory){
            if(apple.test(each)){
                result.add(each);
            }
        }
return result;
    }



}
