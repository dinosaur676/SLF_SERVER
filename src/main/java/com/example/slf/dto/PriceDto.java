package com.example.slf.dto;

public class PriceDto {
    int marketPrice;
    int loadingPrice;
    int lotPrice;
    String createOn;

    public PriceDto() {

    }

    public String getCreateOn() {
        return createOn;
    }

    public PriceDto(int marketPrice, int loadingPrice, int lotPrice, String createdOn) {
        this.marketPrice = marketPrice;
        this.loadingPrice = loadingPrice;
        this.lotPrice = lotPrice;
        this.createOn = createdOn;
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
}
