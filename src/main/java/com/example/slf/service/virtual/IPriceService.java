package com.example.slf.service.virtual;

import com.example.slf.dto.request.price.PriceReqDto;
import com.example.slf.dto.response.price.PriceRespDto;

public interface IPriceService {
    PriceRespDto select(String name, String createdOn);
    void insert(PriceReqDto dto);
    void update(PriceReqDto dto);
}
