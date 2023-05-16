package com.marcos.demo.components.impl;

import com.marcos.demo.components.Coach;

public class GymCoach implements Coach {
    public GymCoach() {
        System.out.println("In constructor: " + this.getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do 4 series of 10 reps of bench press";
    }
}
