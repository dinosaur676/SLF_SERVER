package com.example.slf.adapter.rdb.mapper;

import com.example.slf.dto.Buy;
import com.example.slf.dto.Price;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BuyRowMapper implements RowMapper<Buy> {
    @Override
    public Buy mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Buy(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("buy_time"),
                rs.getInt("size"),
                rs.getInt("count"),
                rs.getInt("price"),
                rs.getString("created_on")
        );
    }
}