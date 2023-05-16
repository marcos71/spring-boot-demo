package com.marcos.demo.components.impl;

import com.marcos.demo.components.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // defines this bean as the main implementation for this interface, but is overwritten if qualifier is used too
public class FootballCoach implements Coach {

    public FootballCoach() {
        System.out.println("In constructor: " + this.getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 15 free kicks";
    }
}
