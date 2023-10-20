package com.example.slf.service;

import com.example.slf.dto.request.chicken.sell.ChickenSellDeleteReqDto;
import com.example.slf.dto.request.chicken.sell.ChickenSellInsertReqDto;
import com.example.slf.dto.request.chicken.sell.ChickenSellUpdateReqDto;
import com.example.slf.dto.request.date.DeleteDateReqDto;
import com.example.slf.dto.request.date.UpdateDateReqDto;
import com.example.slf.dto.response.chicken.sell.ChickenSellRespDto;
import com.example.slf.repository.virtual.IChickenSellRepository;
import com.example.slf.service.virtual.IChickenSellService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ChickenSellService implements IChickenSellService {

    final IChickenSellRepository chickenSellRepository;

    public ChickenSellService(IChickenSellRepository chickenSellRepository) {
        this.chickenSellRepository = chickenSellRepository;
    }

    @Override
    public List<ChickenSellRespDto> select(String parts, String createdOn) {
        return chickenSellRepository.select(parts, createdOn).stream().map(ChickenSellRespDto::create).collect(Collectors.toList());
    }

    @Override
    public List<ChickenSellRespDto> selectByProdId(long id) {
        return chickenSellRepository.selectByProdId(id).stream().map(ChickenSellRespDto::create).collect(Collectors.toList());
    }

    @Override
    public void insert(ChickenSellInsertReqDto dto) {
        chickenSellRepository.insert(dto);
    }

    @Override
    public void update(ChickenSellUpdateReqDto dto) {
        chickenSellRepository.update(dto);
    }

    @Override
    public void updateDate(UpdateDateReqDto dto) {
        chickenSellRepository.updateDate(dto);
    }

    @Override
    public void delete(ChickenSellDeleteReqDto dto) {
        chickenSellRepository.delete(dto);
    }
    @Override
    public void deleteDate(DeleteDateReqDto dto) {
        chickenSellRepository.deleteDate(dto);
    }
}
