package com.example.slf.dto.response.chicken.sell;

import com.example.slf.dto.ChickenSell;

public record ChickenSellRespDto(
        long id,
        String parts,
        String name,
        double count,
        int price,
        int total,
        String type,
        String createdOn,
        long prodId
) {
    static public ChickenSellRespDto create(ChickenSell dto) {
        return new ChickenSellRespDto(
                dto.getId(),
                dto.getParts(),
                dto.getName(),
                dto.getCount(),
                dto.getPrice(),
                dto.getTotal(),
                dto.getType(),
                dto.getCreatedOn(),
                dto.getProdId()
        );
    }
}
