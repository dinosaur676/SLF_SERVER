package com.example.slf.service;

import com.example.slf.dto.Price;
import com.example.slf.dto.request.price.PriceReqDto;
import com.example.slf.dto.response.price.PriceRespDto;
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
    public PriceRespDto select(String name, String createdOn) {

        Price dto = priceRepository.select(name, createdOn);

        if(dto == null)
            return null;

        return PriceRespDto.create(dto);
    }

    @Override
    public void insert(PriceReqDto dto) {
        priceRepository.insert(dto);
    }

    @Override
    public void update(PriceReqDto dto) {
        priceRepository.update(dto);
    }
}
