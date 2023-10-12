package com.example.slf.dto.request.buy;

public record BuyUpdateReqDto(
        long id,
        String name,
        String buyTime,
        int size,
        int count,
        int price
) {
}
