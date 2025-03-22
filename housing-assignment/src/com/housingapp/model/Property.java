package com.housingapp.model;

import com.housingapp.util.CurrencyFormatter;

public abstract class Property {
    private int price;
    private int squareMeters;
    private int numberOfRooms;
    private int numberOfLivingRooms;

    public Property(int price, int squareMeters, int numberOfRooms, int numberOfLivingRooms) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public int getPrice() {
        return price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [price=" + CurrencyFormatter.formatCurrency(price) +
                ", squareMeters=" + squareMeters +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfLivingRooms=" + numberOfLivingRooms + "]";
    }
}
