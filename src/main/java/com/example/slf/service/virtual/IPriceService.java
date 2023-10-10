package com.example.slf.service.virtual;

import com.example.slf.dto.PriceDto;

public interface IPriceService {
    PriceDto select(String create_on);
    void insert(PriceDto dto);
    void update(PriceDto dto);
}
