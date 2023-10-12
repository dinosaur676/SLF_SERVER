package com.example.slf.repository.virtual;

import com.example.slf.dto.Work;
import com.example.slf.dto.request.UpdateDateReqDto;
import com.example.slf.dto.request.work.WorkDeleteReqDto;
import com.example.slf.dto.request.work.WorkInsertReqDto;
import com.example.slf.dto.request.work.WorkUpdateReqDto;

import java.util.List;

public interface IWorkRepository {
    List<Work> select(String createdOn);
    Work selectById(long id);
    void insert(WorkInsertReqDto dto);
    void update(WorkUpdateReqDto dto);
    void updateDate(UpdateDateReqDto dto);
    void delete(WorkDeleteReqDto dto);
}
