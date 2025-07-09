package com.kajal.code.designPatterns.creationalDesignPatterns.Strategy;

public class BikePathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Finding path from " + fromLocation + " to " + toLocation +" By Bike");
    }
}
