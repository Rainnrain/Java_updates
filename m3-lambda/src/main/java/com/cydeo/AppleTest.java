package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        inventory.forEach(apple-> System.out.println(apple));


        List<Apple> heavyApple=filterApples( new AppleHeavyPredicate(), inventory);
        List<Apple> greenApple= filterApples(new AppleGreenColorPredicate(), inventory);



        ApplePredicate weightApple=apple-> apple.getWeight()>200;
        ApplePredicate color= apple-> apple.getColor().equals(Color.GREEN);
    }

    private static List<Apple> filterApples(ApplePredicate applePredicate, List <Apple> inventory){

        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
return result;
    }



}
