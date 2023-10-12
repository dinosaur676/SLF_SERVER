package com.example.slf.service;

import com.example.slf.dto.Buy;
import com.example.slf.dto.request.UpdateDateReqDto;
import com.example.slf.dto.request.buy.BuyDeleteReqDto;
import com.example.slf.dto.request.buy.BuyInsertReqDto;
import com.example.slf.dto.request.buy.BuyUpdateReqDto;
import com.example.slf.dto.response.buy.BuyRespDto;
import com.example.slf.repository.virtual.IBuyRepository;
import com.example.slf.service.virtual.IBuyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuyService implements IBuyService {

    final IBuyRepository buyRepository;

    public BuyService(IBuyRepository buyRepository) {
        this.buyRepository = buyRepository;
    }

    @Override
    public List<BuyRespDto> select(String createdOn) {
        return buyRepository.select(createdOn).stream().map(BuyRespDto::create).collect(Collectors.toList());
    }

    @Override
    public void insert(BuyInsertReqDto dto) {
        buyRepository.insert(dto);
    }

    @Override
    public void update(BuyUpdateReqDto dto) {
        buyRepository.update(dto);
    }

    @Override
    public void updateDate(UpdateDateReqDto dto) {
        buyRepository.updateDate(dto);
    }

    @Override
    public void delete(BuyDeleteReqDto dto) {
        buyRepository.delete(dto);
    }
}
