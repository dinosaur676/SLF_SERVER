package com.example.slf.repository.virtual;

import com.example.slf.dto.DataTableDto;

import java.util.List;

public interface IDataTableRepository {

    List<DataTableDto> selectAll(String mainkey, String subKey, String time);
    void insert(String mainkey, String subKey, DataTableDto dto);
    void delete(int id);
}
