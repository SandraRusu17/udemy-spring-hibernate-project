package com.luv2code.springdemo;

public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spent 1 hour for training";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
