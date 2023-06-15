package com.utk.app.patterns.behavioural.strategy.navigator_app;

public class CarNavStrategy implements NavigationStrategy{

    @Override
    public void navigate(String from, String to) {
        System.out.println("Travelling on Car, from: " + from + " to " + to);
    }
}
