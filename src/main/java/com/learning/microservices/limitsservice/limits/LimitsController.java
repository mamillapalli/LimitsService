package com.learning.microservices.limitsservice.limits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    LimitsConfiguration limitsConfiguration;

    @GetMapping(path="/limits")
    public Limits getLimits()
    {
        //return new Limits(1,100);
        return new Limits(limitsConfiguration.getMinimum(),limitsConfiguration.getMaximum());
    }
}
