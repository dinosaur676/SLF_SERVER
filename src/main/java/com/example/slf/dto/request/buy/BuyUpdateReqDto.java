package com.example.slf.dto.request.buy;

public record BuyUpdateReqDto(
        long id,
        String buyName,
        String buyTime,
        int size,
        int count,
        int price,
        int total
) {
}
