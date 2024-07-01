package com.design.behavioural.observer;

public class ObserverUsage {
    public static void execute(){
        Weather weather = new Weather();

        weather.addObserver(new AajTakObserver());
        weather.addObserver(new DDNewsObserver());

        weather.timePasses();
    }
}
