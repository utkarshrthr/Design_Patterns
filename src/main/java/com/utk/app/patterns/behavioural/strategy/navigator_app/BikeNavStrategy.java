package com.utk.app.patterns.behavioural.strategy.navigator_app;

public class BikeNavStrategy implements NavigationStrategy{

    @Override
    public void navigate(String from, String to) {
        System.out.println("Travelling on Bike, from: " + from + " to " + to);
    }
}
