package com.example.slf.dto.response.buy;

import com.example.slf.dto.Buy;

public record BuyRespDto (
        long id,
        String name,
        String buyTime,
        int size,
        int count,
        int price,
        int total,
        String createdOn,
        int workCount
) {
    static public BuyRespDto create(Buy dto) {
        return new BuyRespDto(
                dto.getId(),
                dto.getName(),
                dto.getBuyTime(),
                dto.getSize(),
                dto.getCount(),
                dto.getPrice(),
                dto.getTotal(),
                dto.getCreatedOn(),
                dto.getWorkCount()
        );
    }
}
