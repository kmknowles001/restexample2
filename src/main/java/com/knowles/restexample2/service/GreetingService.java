package com.knowles.restexample2.service;
import com.knowles.restexample2.entity.*;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

    private final AtomicLong counter = new AtomicLong();

    public Greeting getGreeting(){
        return new Greeting(counter.incrementAndGet(),"Hello World, by service.");
    }
}


