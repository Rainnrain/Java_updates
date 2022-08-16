package com.cydeo.Tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter


public class Apple  {

    Integer AppleWeight;
    AppleColor AppleColor;
    List<ApplePredicate> inventory;

    public Apple(Integer appleWeight, AppleColor appleColor) {
        AppleWeight = appleWeight;
        AppleColor = appleColor;
    }
}
