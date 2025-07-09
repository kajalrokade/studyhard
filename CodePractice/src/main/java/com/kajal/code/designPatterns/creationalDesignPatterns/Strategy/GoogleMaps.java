package com.kajal.code.designPatterns.creationalDesignPatterns.Strategy;

public class GoogleMaps{
    public void findPath(String from, String to, String mode) {
        PathCalculatorStrategy pathCalculatorStrategy =
                PathCalculatorFactory.getPathCalculatorForMode(mode);

        pathCalculatorStrategy.findPath(from, to);
    }
}
