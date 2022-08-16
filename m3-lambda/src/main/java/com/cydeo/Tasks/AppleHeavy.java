package com.cydeo.Tasks;

public class AppleHeavy implements ApplePredicate{
    @Override
    public String test(Apple apple) {
        String a="An apple of "+ apple.getAppleWeight().toString()+"g";
       return a;
    }
}
