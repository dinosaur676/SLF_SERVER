package com.example.slf.service.virtual;

import com.example.slf.dto.request.date.DeleteDateReqDto;
import com.example.slf.dto.request.date.UpdateDateReqDto;
import com.example.slf.dto.request.work.WorkDeleteReqDto;
import com.example.slf.dto.request.work.WorkInsertReqDto;
import com.example.slf.dto.request.work.WorkUpdateReqDto;
import com.example.slf.dto.response.work.WorkRespDto;

import java.util.List;

public interface IWorkService {
    List<WorkRespDto> select(String createdOn);
    WorkRespDto selectById(long id);
    List<WorkRespDto> selectByBuyId(long buyId);
    void insert(WorkInsertReqDto dto);
    void update(WorkUpdateReqDto dto);
    void updateDate(UpdateDateReqDto dto);
    void delete(WorkDeleteReqDto dto);
    void deleteDate(DeleteDateReqDto dto);
}
