package com.example.slf.service.virtual;

import com.example.slf.dto.request.chicken.production.ChickenProductionInsertDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionUpdateDto;
import com.example.slf.dto.response.chicken.production.ChickenProductionRespDto;

import java.util.List;

public interface IChickenProductionService {
    List<ChickenProductionRespDto> selectAll(String parts, String createdOn);
    void insert(ChickenProductionInsertDto dto);
    void delete(int id);
    void update(ChickenProductionUpdateDto dto);
    void updateDate(String before, String after);
}
