package com.example.slf.dto.request.chicken.sell;

public record ChickenSellUpdateReqDto(
        long id,
        String name,
        double count,
        int price,
        int total,
        String type
) {
}
