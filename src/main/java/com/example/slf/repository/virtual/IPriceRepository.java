package com.example.slf.repository.virtual;


import com.example.slf.dto.Price;
import com.example.slf.dto.request.price.PriceReqDto;

public interface IPriceRepository {

    Price select(String name, String createdOn);
    void insert(PriceReqDto dto);
    void update(PriceReqDto dto);

}
