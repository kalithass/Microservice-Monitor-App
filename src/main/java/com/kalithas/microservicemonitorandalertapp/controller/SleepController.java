package com.kalithas.microservicemonitorandalertapp.controller;

import com.kalithas.microservicemonitorandalertapp.exception.ValidationException;
import com.kalithas.microservicemonitorandalertapp.service.SleepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sleep")
public class SleepController {

    @Autowired
    SleepService sleepService;


    @PostMapping("/{minutes}")
    public String sleep(@PathVariable("minutes") int minutes) throws InterruptedException {
        // pause the api call for n minutes
        // if we continuously trigger the api 5 times grafana will throw the email alert
        sleepService.sleepFor(minutes);
        return "Successfully paused the api call for "+minutes+" minutes";
    }
}
