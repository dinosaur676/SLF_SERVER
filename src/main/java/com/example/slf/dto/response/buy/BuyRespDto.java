package com.example.slf.dto.response.buy;

import com.example.slf.dto.Buy;

public record BuyRespDto (
        long id,
        String name,
        String buyTime,
        int count,
        int price,
        String createdOn
) {
    static public BuyRespDto create(Buy dto) {
        return new BuyRespDto(
                dto.getId(),
                dto.getName(),
                dto.getBuyTime(),
                dto.getCount(),
                dto.getPrice(),
                dto.getCreatedOn()
        );
    }
}
