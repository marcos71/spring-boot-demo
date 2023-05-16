package com.marcos.demo.rest;

import com.marcos.demo.components.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coach") // base mapping for controller
public class CoachController {

    private Coach myCoach;

    // constructor injection approach
    @Autowired
    public CoachController(@Qualifier("gymCoach") Coach theCoach) {
        System.out.println("In constructor: " + this.getClass().getName());
        this.myCoach = theCoach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

/*
    // setter injection approach
    @Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }
    */
}
