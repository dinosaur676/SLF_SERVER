package com.example.slf.dto.request.price;

public record PriceReqDto(
        String name,
        int marketPrice,
        int loadingPrice,
        int lotPrice,
        String createdOn
) {
}
