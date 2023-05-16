package com.marcos.demo.components.impl;

import com.marcos.demo.components.Coach;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    public BasketballCoach() {
        System.out.println("In constructor: " + this.getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Shoot 10 free throws";
    }
}
