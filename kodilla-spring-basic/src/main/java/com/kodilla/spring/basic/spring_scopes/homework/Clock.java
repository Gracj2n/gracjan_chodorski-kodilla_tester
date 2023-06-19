package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Scope("prototype")
public class Clock {
    Instant time;
    public Clock() {
        System.out.println(this.time = Instant.now());
    }
}
