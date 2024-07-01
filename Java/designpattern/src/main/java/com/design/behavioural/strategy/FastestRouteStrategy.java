package com.design.behavioural.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FastestRouteStrategy implements RouteStrategy{
    @Override
    public void calculateRoute(String from, String to) {
        log.info("Calculating fastest route between: {} and {}", from.toUpperCase(), to.toUpperCase());
    }
}
