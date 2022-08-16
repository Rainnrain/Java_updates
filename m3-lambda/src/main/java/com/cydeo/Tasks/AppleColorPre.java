package com.cydeo.Tasks;

public class AppleColorPre implements ApplePredicate{
    @Override
    public String test(Apple apple) {
String a="A ";
if(apple.getAppleWeight()>150){
    a+="heavy ";
}else{
    a+="light ";
}
        a+=apple.getAppleColor().toString()+" apple";
return a;
    }
}
