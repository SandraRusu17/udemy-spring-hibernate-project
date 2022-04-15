package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

    // create an array of strings
    private String[] fortunes = {"first_fortune", "second_fortune", "third_fortune"};

    // create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {

        int randomInt = random.nextInt(fortunes.length);
        return "The random fortune is :" + fortunes[randomInt];
    }
}
