package com.example.slf.dto;

import java.time.LocalDateTime;

public class DataTableDto {
    long id;
    String name;
    double count;
    int price;
    int total;
    String createOn;

    DataTableDto() {}


    public DataTableDto(String name, double count, int price, int total, String createOn) {
        this.id = -1;
        this.name = name;
        this.count = count;
        this.price = price;
        this.total = total;
        this.createOn = createOn;
    }

    public DataTableDto(long id, String name, double count, int price, int total, String createOn) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
        this.total = total;
        this.createOn = createOn;
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

    public long getId() {
        return id;
    }

    public String getCreateOn() {
        return createOn;
    }
}
