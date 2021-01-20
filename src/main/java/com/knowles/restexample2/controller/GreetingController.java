package com.knowles.restexample2.controller;

import com.knowles.restexample2.service.GreetingService;
import com.knowles.restexample2.entity.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final GreetingService srv = new GreetingService();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        return srv.getGreeting();
     //   return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}