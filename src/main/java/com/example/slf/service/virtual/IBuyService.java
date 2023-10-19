package com.example.slf.service.virtual;

import com.example.slf.dto.Buy;
import com.example.slf.dto.request.UpdateDateReqDto;
import com.example.slf.dto.request.buy.BuyDeleteReqDto;
import com.example.slf.dto.request.buy.BuyInsertReqDto;
import com.example.slf.dto.request.buy.BuyUpdateReqDto;
import com.example.slf.dto.response.buy.BuyRespDto;

import java.util.List;

public interface IBuyService {
    List<BuyRespDto> select(String createdOn);

    BuyRespDto selectOne(String name, String buyTime, int size, String createdOn);

    BuyRespDto selectById(long id);
    void insert(BuyInsertReqDto dto);
    void update(BuyUpdateReqDto dto);
    void updateDate(UpdateDateReqDto dto);
    void delete(BuyDeleteReqDto dto);
}
