package com.mzharkenov.models;

import org.springframework.stereotype.Component;

@Component
public class CarServiceImpl implements CarService {
    public void checkComputer() {
        System.out.println("Computer checked.");
    }
}
