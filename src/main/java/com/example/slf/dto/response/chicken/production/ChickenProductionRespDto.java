package com.example.slf.dto.response.chicken.production;

import com.example.slf.dto.ChickenProduction;

public record ChickenProductionRespDto(
        long id,
        String parts,
        String name,
        double count,
        int price,
        int total,
        String type,
        String createdOn
) {
    static public ChickenProductionRespDto create(ChickenProduction dto) {
        return new ChickenProductionRespDto(
                dto.getId(),
                dto.getParts(),
                dto.getName(),
                dto.getCount(),
                dto.getPrice(),
                dto.getTotal(),
                dto.getType(),
                dto.getCreatedOn()
        );
    }
}
