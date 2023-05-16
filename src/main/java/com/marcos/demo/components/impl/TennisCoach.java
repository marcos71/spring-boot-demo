package com.marcos.demo.components.impl;

import com.marcos.demo.components.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // only creates the bean if needed
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In constructor: " + this.getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice top spin shot";
    }
}
