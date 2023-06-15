package com.utk.app.patterns.behavioural.strategy.navigator_app;

public class NavigationApp {

    public static void main(String[] args) {
        NavigationStrategy bikeStrategy = new BikeNavStrategy();
        NavigationMap map = new NavigationMap(bikeStrategy);
        map.navigate("Lucknow", "Kanpur");
        map.setNavigationStrategy(new CarNavStrategy());
        map.navigate("Kanpur", "New Delhi");
    }
}
