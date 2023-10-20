package com.example.slf.service.virtual;

import com.example.slf.dto.ChickenProduction;
import com.example.slf.dto.request.chicken.production.ChickenProductionDeleteDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionInsertDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionUpdateDto;
import com.example.slf.dto.request.date.DeleteDateReqDto;
import com.example.slf.dto.request.date.UpdateDateReqDto;
import com.example.slf.dto.response.chicken.production.ChickenProductionRespDto;

import java.util.List;

public interface IChickenProductionService {
    List<ChickenProductionRespDto> selectAll(String parts, String createdOn);
    List<ChickenProductionRespDto> selectJustDate(String createdOn);
    ChickenProductionRespDto selectById(long id);
    void insert(ChickenProductionInsertDto dto);
    void delete(ChickenProductionDeleteDto dto);
    void update(ChickenProductionUpdateDto dto);
    void updateDate(UpdateDateReqDto dto);
    void deleteDate(DeleteDateReqDto dto);
}
