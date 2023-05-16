package com.marcos.demo.config;

import com.marcos.demo.components.Coach;
import com.marcos.demo.components.impl.GymCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// good for wrapping 3rd party classes and making them available in our spring context
@Configuration
public class DemoConfiguration {

    @Bean
    public Coach gymCoach() {
        return new GymCoach();
    }
}
