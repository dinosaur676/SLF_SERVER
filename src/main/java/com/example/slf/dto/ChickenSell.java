package com.example.slf.dto;

public class ChickenSell {
    long id;
    String parts;
    String name;
    double count;
    int price;
    int total;
    String createdOn;
    String type;
    long prodId;

    public ChickenSell(long id, String parts, String name, double count, int price, int total, String createdOn, String type, long prodId) {
        this.id = id;
        this.parts = parts;
        this.name = name;
        this.count = count;
        this.price = price;
        this.total = total;
        this.createdOn = createdOn;
        this.type = type;
        this.prodId = prodId;
    }

    public long getProdId() {
        return prodId;
    }

    public String getType() {
        return type;
    }

    public String getCreatedOn() {
        return createdOn;
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

}
