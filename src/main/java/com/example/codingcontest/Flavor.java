package com.example.codingcontest;

public enum Flavor {
    CHOCOLATE("Chocolate", 2.50),
    VANILLA("Vanilla", 2.30),
    STRAWBERRY("Strawberry", 2.40),
    MANGO("Mango", 2.60);

    private final String name;
    private final double grossPrice;

    Flavor(String name, double grossPrice) {
        this.name = name;
        this.grossPrice = grossPrice;
    }

    public String getName() {
        return name;
    }

    public double getGrossPrice() {
        return grossPrice;
    }

    @Override
    public String toString() {
        return name + " (€" + grossPrice + ")";
    }
}