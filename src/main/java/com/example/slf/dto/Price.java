package com.example.slf.dto;

public class Price {
    long id;
    String name;
    int marketPrice;
    int loadingPrice;
    int lotPrice;
    String createdOn;

    public Price(long id, String name, int marketPrice, int loadingPrice, int lotPrice, String createdOn) {
        this.id = id;
        this.name = name;
        this.marketPrice = marketPrice;
        this.loadingPrice = loadingPrice;
        this.lotPrice = lotPrice;
        this.createdOn = createdOn;
    }

    public Price(String name, int marketPrice, int loadingPrice, int lotPrice, String createdOn) {
        this.name = name;
        this.marketPrice = marketPrice;
        this.loadingPrice = loadingPrice;
        this.lotPrice = lotPrice;
        this.createdOn = createdOn;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarketPrice() {
        return marketPrice;
    }

    public int getLoadingPrice() {
        return loadingPrice;
    }

    public int getLotPrice() {
        return lotPrice;
    }

    public String getCreatedOn() {
        return createdOn;
    }
}
