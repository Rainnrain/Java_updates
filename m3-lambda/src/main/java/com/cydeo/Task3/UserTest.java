package com.cydeo.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Smith", 35));
        users.add(new User("Tom", "Evan", 25));

        // Print all elements
        // Print all people whose last name starts with E

       // Consumer<User> action = p -> System.out.println(p);
       // Predicate<User> test = p -> p.getLastName().charAt(0) == 'E';
        print(p->true, users);
       // print (test, users);
        print( p->p.getLastName().charAt(0) == 'E', users);
        //If you do it this way you need to pass the Predicate type in the method parameters.

    }

    public static void print(Predicate <User> p, List<User> users) {

        for (User each : users) {
            if (p.test(each)) {

                System.out.println(each.toString());

            }
        }
    }
}
