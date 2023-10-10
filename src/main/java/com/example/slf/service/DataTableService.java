package com.example.slf.service;

import com.example.slf.dto.DataTableDto;
import com.example.slf.repository.virtual.IDataTableRepository;
import com.example.slf.service.virtual.IDataTableService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataTableService implements IDataTableService {

    final IDataTableRepository dataTableRepository;

    public DataTableService(IDataTableRepository dataTableRepository) {
        this.dataTableRepository = dataTableRepository;
    }

    @Override
    public List<DataTableDto> selectAll(String mainkey, String subKey, String time) {
        return dataTableRepository.selectAll(mainkey, subKey, time);
    }

    @Override
    public void insert(String mainkey, String subKey, DataTableDto dto) {
        dataTableRepository.insert(mainkey, subKey, dto);
    }

    @Override
    public void delete(int id) {
        dataTableRepository.delete(id);
    }
}
