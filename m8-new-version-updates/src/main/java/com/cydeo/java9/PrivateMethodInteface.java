package com.cydeo.java9;

import java.time.LocalDate;

public interface PrivateMethodInteface {

    boolean isHoliday(LocalDate date);

    default boolean isBusinessDay(LocalDate date){
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
        return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date){
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate): nextDate;
    }

}