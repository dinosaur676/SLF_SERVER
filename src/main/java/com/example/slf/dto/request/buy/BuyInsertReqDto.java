package com.example.slf.dto.request.buy;

public record BuyInsertReqDto(
        String name,
        String buyTime,
        int size,
        int count,
        int price,
        String createdOn
) {
}
