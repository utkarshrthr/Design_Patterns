package com.utk.app.patterns.behavioural.strategy.navigator_app;

public class NavigationMap {

    private NavigationStrategy navigationStrategy;

    public NavigationMap(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void navigate(String from, String to){
        navigationStrategy.navigate(from, to);
    }

    public void setNavigationStrategy(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }
}
