package com.utk.app.patterns.behavioural.strategy.navigator_app;

public class WalkNavStrategy implements NavigationStrategy{

    @Override
    public void navigate(String from, String to) {
        System.out.println("Travelling on Foot, from: " + from + " to " + to);
    }
}
