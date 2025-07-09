package com.kajal.code.DSA.FunctionalInterface;

import java.util.List;
import java.util.function.Consumer;
/**
 * Consumer is a functional interface whic has the abstract accept() method
 */

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {
        List<String> names = List.of("Kajal", "Ravi", "Kiran", "Ramu", "Komal");

        Consumer<String> printer = name -> System.out.println("Hello, " + name);
        System.out.println("Greeting all names:");
        names.forEach(printer);
        System.out.println("\n");
        System.out.println("Using Stream:\n");


        names.stream().forEach(name -> System.out.println("Hello, "+name));
    }
}
