package com.example.slf.adapter.rdb.mapper;

import com.example.slf.dto.DataTableDto;
import com.example.slf.dto.PriceDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PriceRowMapper implements RowMapper<PriceDto> {
    @Override
    public PriceDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new PriceDto(
                rs.getInt("market_price"),
                rs.getInt("loading_price"),
                rs.getInt("lot_price"),
                rs.getString("create_on")
        );
    }
}