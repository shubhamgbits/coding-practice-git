package com.design.behavioural.strategy;

public class NavigationStrategyContext {
    private RouteStrategy strategy;

    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(String from, String to) {
        strategy.calculateRoute(from, to);
    }
}
