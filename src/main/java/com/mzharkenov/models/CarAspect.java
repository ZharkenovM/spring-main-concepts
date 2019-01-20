package com.mzharkenov.models;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CarAspect {
    @Before("execution(* com.mzharkenov.models.Car.getName(..))")
    public void beforeGetName() {
        System.out.println("Before getting name...");
    }
}
