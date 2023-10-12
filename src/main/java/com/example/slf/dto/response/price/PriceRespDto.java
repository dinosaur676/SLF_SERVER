package com.example.slf.dto.response.price;

import com.example.slf.dto.Price;

public record PriceRespDto(
        long id,
        String name,
        int marketPrice,
        int loadingPrice,
        int lotPrice,
        String createdOn
) {
    static public PriceRespDto create(Price dto) {
        return new PriceRespDto(
                dto.getId(),
                dto.getName(),
                dto.getMarketPrice(),
                dto.getLoadingPrice(),
                dto.getLotPrice(),
                dto.getCreatedOn()
        );
    }

}
