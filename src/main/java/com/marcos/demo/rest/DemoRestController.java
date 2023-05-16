package com.marcos.demo.rest;

import com.marcos.demo.components.Coach;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @Value("${testing.sarasa.props.name}")
    private String name;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World, my name is " + name;
    }

    @GetMapping("/workout")
    public String testWorkout() {
        return "Test get workout endpoint";
    }

    // 116217011 nro cliente
    // 9412349879 zakc refrigeracion
}
