package com.example.slf.adapter.rdb.mapper;

import com.example.slf.dto.DataTableDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataTableRowMapper implements RowMapper<DataTableDto> {
    @Override
    public DataTableDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new DataTableDto(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getDouble("count"),
                rs.getInt("price"),
                rs.getInt("total"),
                rs.getString("create_on")
        );
    }
}