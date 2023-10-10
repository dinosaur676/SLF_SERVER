package com.example.slf.service.virtual;

import com.example.slf.dto.DataTableDto;

import java.util.List;

public interface IDataTableService {
    List<DataTableDto> selectAll(String mainkey, String subKey, String time);
    void insert(String mainkey, String subKey, DataTableDto dto);
    void delete(int id);
}
