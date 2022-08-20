package com.cydeo.q1;
import com.cydeo.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Apple {

    private int weight;
    private Colors color;



}
enum Colors{
    YELLOW, RED, ORANGE
}
