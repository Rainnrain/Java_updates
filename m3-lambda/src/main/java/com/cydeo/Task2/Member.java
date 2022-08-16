package com.cydeo.Task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Member {

    String name;
    Integer age;
    private Gender gender;
    private String emailAddress;

}
