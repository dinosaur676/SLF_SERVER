package com.example.slf.adapter.rdb.mapper;

import com.example.slf.dto.ChickenProduction;
import com.example.slf.dto.ChickenSell;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChickenSellRowMapper implements RowMapper<ChickenSell> {
    @Override
    public ChickenSell mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ChickenSell(
                rs.getLong("id"),
                rs.getString("parts"),
                rs.getString("name"),
                rs.getLong("count"),
                rs.getInt("price"),
                rs.getInt("total"),
                rs.getString("created_on"),
                rs.getString("type"),
                rs.getLong("prod_id")
        );
    }
}