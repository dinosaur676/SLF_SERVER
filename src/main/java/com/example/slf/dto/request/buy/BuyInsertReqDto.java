package com.example.slf.dto.request.buy;

public record BuyInsertReqDto(
        String buyName,
        String buyTime,
        int size,
        int count,
        int price,
        int total,
        String createdOn
) {
}
