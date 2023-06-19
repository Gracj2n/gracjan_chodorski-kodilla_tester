package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Scope("prototype")
public class Clock {
    public Clock() {
        System.out.println("Actual time: " + Instant.now());
    }
}
