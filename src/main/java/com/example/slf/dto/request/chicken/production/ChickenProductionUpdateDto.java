package com.example.slf.dto.request.chicken.production;

public record ChickenProductionUpdateDto(
        long id,
        String name,
        double count,
        int price,
        int total,
        String type
) {
}
