package com.kalithas.microservicemonitorandalertapp.service;

import com.kalithas.microservicemonitorandalertapp.exception.ValidationException;
import org.springframework.stereotype.Service;

@Service
public class SleepService {

    private static final long MINUTE_TO_MILLISECONDS = 60000;

    public void sleepFor(int minutes) throws InterruptedException {
        if (minutes>5) throw new ValidationException("Provided time should be less than 5");
        Thread.sleep(minutes * MINUTE_TO_MILLISECONDS);
    }
}
