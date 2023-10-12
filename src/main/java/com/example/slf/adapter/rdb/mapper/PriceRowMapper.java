package com.example.slf.adapter.rdb.mapper;

import com.example.slf.dto.Price;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PriceRowMapper implements RowMapper<Price> {
    @Override
    public Price mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Price(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getInt("market_price"),
                rs.getInt("loading_price"),
                rs.getInt("lot_price"),
                rs.getString("created_on")
        );
    }
}