package com.example.slf.adapter.rdb.mapper;

import com.example.slf.dto.Price;
import com.example.slf.dto.Work;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WorkRowMapper implements RowMapper<Work> {
    @Override
    public Work mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Work(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("work_time"),
                rs.getInt("size"),
                rs.getInt("count"),
                rs.getInt("price"),
                rs.getString("created_on")
        );
    }
}