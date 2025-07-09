package com.kajal.code.DSA.FunctionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    public static void main(String[] args) {
        Supplier<String> randomNameSupplier = () -> "Kajal" + new Random().nextInt(100);
        System.out.println("Random name from supplier: " + randomNameSupplier.get());
    }
}
