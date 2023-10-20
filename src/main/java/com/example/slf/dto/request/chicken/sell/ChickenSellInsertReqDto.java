package com.example.slf.dto.request.chicken.sell;

public record ChickenSellInsertReqDto(
        String parts,
        String name,
        double count,
        int price,
        int total,
        String type,
        long prodId,
        String createdOn
) {
}
