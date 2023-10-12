package com.example.slf.adapter.rdb.mapper;

import com.example.slf.dto.Company;
import com.example.slf.dto.Price;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyRowMapper implements RowMapper<Company> {
    @Override
    public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Company(
                rs.getLong("id"),
                rs.getString("name")
        );
    }
}