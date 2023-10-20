package com.example.slf.service;

import com.example.slf.dto.ChickenProduction;
import com.example.slf.dto.request.chicken.production.ChickenProductionDeleteDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionInsertDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionUpdateDto;
import com.example.slf.dto.request.date.DeleteDateReqDto;
import com.example.slf.dto.request.date.UpdateDateReqDto;
import com.example.slf.dto.response.chicken.production.ChickenProductionRespDto;
import com.example.slf.repository.virtual.IChickenProductionRepository;
import com.example.slf.service.virtual.IChickenProductionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChickenProductionService implements IChickenProductionService {

    final IChickenProductionRepository chickenProductionRepository;

    public ChickenProductionService(IChickenProductionRepository chickenProductionRepository) {
        this.chickenProductionRepository = chickenProductionRepository;
    }

    @Override
    public List<ChickenProductionRespDto> selectAll(String parts, String createdOn) {
        return chickenProductionRepository.selectAll(parts, createdOn).stream().map(ChickenProductionRespDto::create).collect(Collectors.toList());
    }

    @Override
    public List<ChickenProductionRespDto> selectJustDate(String createdOn) {
        return chickenProductionRepository.selectJustDate(createdOn).stream().map(ChickenProductionRespDto::create).collect(Collectors.toList());
    }

    @Override
    public ChickenProductionRespDto selectById(long id) {
        ChickenProduction chickenProduction = chickenProductionRepository.selectById(id);

        if(chickenProduction == null)
            return null;

        return ChickenProductionRespDto.create(chickenProduction);
    }

    @Override
    public void insert(ChickenProductionInsertDto dto) {
        chickenProductionRepository.insert(dto);
    }

    @Override
    public void delete(ChickenProductionDeleteDto dto) {
        chickenProductionRepository.delete(dto);
    }

    @Override
    public void update(ChickenProductionUpdateDto dto) {
        chickenProductionRepository.update(dto);
    }

    @Override
    public void updateDate(UpdateDateReqDto dto) {
        chickenProductionRepository.updateDate(dto);
    }
    @Override
    public void deleteDate(DeleteDateReqDto dto) {
        chickenProductionRepository.deleteDate(dto);
    }
}
