package com.example.slf.service;

import com.example.slf.dto.Buy;
import com.example.slf.dto.request.date.DeleteDateReqDto;
import com.example.slf.dto.request.date.UpdateDateReqDto;
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
    public BuyRespDto selectOne(String name, String buyTime, int size, String createdOn) {
        Buy buy = buyRepository.selectOne(name, buyTime, size, createdOn);

        if(buy == null)
            return null;

        return BuyRespDto.create(buy);
    }

    @Override
    public BuyRespDto selectById(long id) {
        Buy buy = buyRepository.selectById(id);

        if(buy == null)
            return null;

        return BuyRespDto.create(buy);
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

    @Override
    public void deleteDate(DeleteDateReqDto dto) {
        buyRepository.deleteDate(dto);
    }
}
