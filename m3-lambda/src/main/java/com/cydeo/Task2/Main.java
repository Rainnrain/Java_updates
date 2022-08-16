package com.cydeo.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Member> memberList= new ArrayList<>();
        memberList.add(new Member("Lorraine", 18, Gender.FEMALE, "lor@gmail.com"));
        memberList.add(new Member("Ramazan", 25, Gender.MALE, "rcet@gmail.com"));

        Message message = member -> member.getGender()==Gender.MALE&& member.getAge()>=18 && member.getAge()<=25;


        text(message, memberList);
    }

    private static void text (Message message,List <Member> memberList){

        for(Member each: memberList){
                if(message.msg(each)){
                    System.out.println("Hi, please come by my office today "+ each.getName());

                }
         }
     }
}
