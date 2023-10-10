package com.example.slf.service;

import com.example.slf.adapter.rdb.sql.PriceSQL;
import com.example.slf.dto.PriceDto;
import com.example.slf.repository.virtual.IPriceRepository;
import com.example.slf.service.virtual.IPriceService;
import org.springframework.stereotype.Service;

@Service
public class PriceService implements IPriceService {

    final IPriceRepository priceRepository;

    public PriceService(IPriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public PriceDto select(String create_on) {
        return priceRepository.select(create_on);
    }

    @Override
    public void insert(PriceDto dto) {
        priceRepository.insert(dto);
    }

    @Override
    public void update(PriceDto dto) {
        priceRepository.update(dto);
    }
}
