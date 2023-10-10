package com.example.slf.repository.virtual;


import com.example.slf.dto.PriceDto;

public interface IPriceRepository {

    PriceDto select(String create_on);
    void insert(PriceDto dto);
    void update(PriceDto dto);

}
