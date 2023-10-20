package com.example.slf.repository.virtual;

import com.example.slf.dto.ChickenProduction;
import com.example.slf.dto.request.chicken.production.ChickenProductionDeleteDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionInsertDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionUpdateDto;
import com.example.slf.dto.request.date.DeleteDateReqDto;
import com.example.slf.dto.request.date.UpdateDateReqDto;

import java.util.List;

public interface IChickenProductionRepository {

    List<ChickenProduction> selectAll(String parts, String createdOn);
    List<ChickenProduction> selectJustDate(String createdOn);
    ChickenProduction selectById(long id);
    void insert(ChickenProductionInsertDto dto);
    void delete(ChickenProductionDeleteDto dto);
    void update(ChickenProductionUpdateDto dto);
    void updateDate(UpdateDateReqDto dto);
    void deleteDate(DeleteDateReqDto dto);
}
