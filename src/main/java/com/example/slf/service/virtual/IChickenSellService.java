package com.example.slf.service.virtual;

import com.example.slf.dto.ChickenSell;
import com.example.slf.dto.request.chicken.sell.ChickenSellDeleteReqDto;
import com.example.slf.dto.request.chicken.sell.ChickenSellInsertReqDto;
import com.example.slf.dto.request.chicken.sell.ChickenSellUpdateReqDto;
import com.example.slf.dto.request.date.DeleteDateReqDto;
import com.example.slf.dto.request.date.UpdateDateReqDto;
import com.example.slf.dto.response.chicken.sell.ChickenSellRespDto;

import java.util.List;

public interface IChickenSellService {
    List<ChickenSellRespDto> select(String parts, String createdOn);
    List<ChickenSellRespDto> selectByProdId(long id);
    void insert(ChickenSellInsertReqDto dto);
    void update(ChickenSellUpdateReqDto dto);
    void updateDate(UpdateDateReqDto dto);
    void delete(ChickenSellDeleteReqDto dto);
    void deleteDate(DeleteDateReqDto dto);
}
