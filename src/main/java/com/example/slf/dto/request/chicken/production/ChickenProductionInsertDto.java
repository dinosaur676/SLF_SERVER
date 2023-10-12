package com.example.slf.dto.request.chicken.production;

public record ChickenProductionInsertDto(
        String parts,
        String name,
        double count,
        int price,
        int total,
        String type,
        String createdOn
) {
}
