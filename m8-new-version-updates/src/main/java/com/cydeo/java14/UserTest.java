package com.cydeo.java14;

public class UserTest {
    public static void main(String[] args) {



    User user = new User("Lorraine", "Home");
       // System.out.println(User); Cannot Call this through the class because it is private
        System.out.println(user.name()); // don't use get anymore
        System.out.println(user.toString());
}
}
