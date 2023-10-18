package com.example.slf.service;

import com.example.slf.dto.Work;
import com.example.slf.dto.request.UpdateDateReqDto;
import com.example.slf.dto.request.work.WorkDeleteReqDto;
import com.example.slf.dto.request.work.WorkInsertReqDto;
import com.example.slf.dto.request.work.WorkUpdateReqDto;
import com.example.slf.dto.response.work.WorkRespDto;
import com.example.slf.repository.virtual.IWorkRepository;
import com.example.slf.service.virtual.IWorkService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkService implements IWorkService {

    final IWorkRepository workRepository;

    public WorkService(IWorkRepository workRepository) {
        this.workRepository = workRepository;
    }

    @Override
    public List<WorkRespDto> select(String createdOn) {
        return workRepository.select(createdOn).stream().map(WorkRespDto::create).collect(Collectors.toList());
    }

    @Override
    public WorkRespDto selectById(long id) {
        Work dto = workRepository.selectById(id);

        if(dto == null)
            return null;

        return WorkRespDto.create(dto);
    }

    @Override
    public List<WorkRespDto> selectByBuyId(long buyId) {
        return workRepository.selectByBuyID(buyId).stream().map(WorkRespDto::create).collect(Collectors.toList());
    }

    @Override
    public void insert(WorkInsertReqDto dto) {
        workRepository.insert(dto);
    }

    @Override
    public void update(WorkUpdateReqDto dto) {
        workRepository.update(dto);
    }

    @Override
    public void updateDate(UpdateDateReqDto dto) {
        workRepository.updateDate(dto);
    }

    @Override
    public void delete(WorkDeleteReqDto dto) {
        workRepository.delete(dto);
    }
}
