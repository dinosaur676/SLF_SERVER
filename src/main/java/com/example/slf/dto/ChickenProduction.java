package com.example.slf.dto;

public class ChickenProduction {
    long id;
    String parts;
    String name;
    double count;
    int price;
    int total;
    String type;
    String createdOn;

    public ChickenProduction(long id, String parts, String name, double count, int price, int total, String type, String createdOn) {
        this.id = id;
        this.parts = parts;
        this.name = name;
        this.count = count;
        this.price = price;
        this.total = total;
        this.type = type;
        this.createdOn = createdOn;
    }

    public ChickenProduction(String parts, String name, double count, int price, int total, String type, String createdOn) {
        this.parts = parts;
        this.name = name;
        this.count = count;
        this.price = price;
        this.total = total;
        this.type = type;
        this.createdOn = createdOn;
    }

    public long getId() {
        return id;
    }

    public String getParts() {
        return parts;
    }

    public String getName() {
        return name;
    }

    public double getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public int getTotal() {
        return total;
    }

    public String getType() {
        return type;
    }

    public String getCreatedOn() {
        return createdOn;
    }
}
