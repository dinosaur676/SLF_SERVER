package com.example.slf.dto;

public class Buy {
    long id;
    String name;
    String buyTime;
    int size;
    int count;
    int price;
    int total;
    String createdOn;

    int workCount;

    public Buy(long id, String name, String buyTime, int size, int count, int price, int total, String createdOn, int workCount) {
        this.id = id;
        this.name = name;
        this.buyTime = buyTime;
        this.size = size;
        this.count = count;
        this.price = price;
        this.total = total;
        this.createdOn = createdOn;
        this.workCount = workCount;
    }

    public int getWorkCount() {
        return workCount;
    }

    public int getTotal() {
        return total;
    }

    public int getSize() {
        return size;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBuyTime() {
        return buyTime;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public String getCreatedOn() {
        return createdOn;
    }
}
