package com.example.slf.dto;

public class Work {
    long id;
    String name;
    String workTime;
    int size;
    int count;
    int price;
    String createdOn;

    public Work(long id, String name, String workTime, int size, int count, int price, String createdOn) {
        this.id = id;
        this.name = name;
        this.workTime = workTime;
        this.size = size;
        this.count = count;
        this.price = price;
        this.createdOn = createdOn;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWorkTime() {
        return workTime;
    }

    public int getSize() {
        return size;
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
