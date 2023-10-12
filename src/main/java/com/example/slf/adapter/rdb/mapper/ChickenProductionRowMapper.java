package com.example.slf.adapter.rdb.mapper;

import com.example.slf.dto.ChickenProduction;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChickenProductionRowMapper implements RowMapper<ChickenProduction> {
    @Override
    public ChickenProduction mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ChickenProduction(
                rs.getLong("id"),
                rs.getString("parts"),
                rs.getString("name"),
                rs.getLong("count"),
                rs.getInt("price"),
                rs.getInt("total"),
                rs.getString("type"),
                rs.getString("created_on")
        );
    }
}