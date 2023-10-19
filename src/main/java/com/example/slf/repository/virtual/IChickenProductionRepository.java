package com.example.slf.repository.virtual;

import com.example.slf.dto.ChickenProduction;
import com.example.slf.dto.request.chicken.production.ChickenProductionDeleteDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionInsertDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionUpdateDto;

import java.util.List;

public interface IChickenProductionRepository {

    List<ChickenProduction> selectAll(String parts, String createdOn);
    void insert(ChickenProductionInsertDto dto);
    void delete(ChickenProductionDeleteDto dto);
    void update(ChickenProductionUpdateDto dto);
    void updateDate(String before, String after);
}
