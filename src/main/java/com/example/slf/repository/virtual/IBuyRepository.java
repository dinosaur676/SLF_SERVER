package com.example.slf.repository.virtual;

import com.example.slf.dto.Buy;
import com.example.slf.dto.request.UpdateDateReqDto;
import com.example.slf.dto.request.buy.BuyDeleteReqDto;
import com.example.slf.dto.request.buy.BuyInsertReqDto;
import com.example.slf.dto.request.buy.BuyUpdateReqDto;

import java.util.List;

public interface IBuyRepository {
    List<Buy> select(String createdOn);

    Buy selectOne(String name, String buyTime, int size, String createdOn);

    Buy selectById(long id);
    void insert(BuyInsertReqDto dto);
    void update(BuyUpdateReqDto dto);
    void updateDate(UpdateDateReqDto dto);
    void delete(BuyDeleteReqDto dto);
}
