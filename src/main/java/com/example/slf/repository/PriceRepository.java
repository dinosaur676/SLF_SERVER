package com.example.slf.repository;

import com.example.framework.jdbc.JdbcCommand;
import com.example.framework.jdbc.JdbcQuery;
import com.example.slf.adapter.rdb.mapper.PriceRowMapper;
import com.example.slf.adapter.rdb.sql.PriceSQL;
import com.example.slf.dto.Price;
import com.example.slf.dto.request.price.PriceReqDto;
import com.example.slf.repository.virtual.IPriceRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PriceRepository implements IPriceRepository {

    private final JdbcCommand jdbcCommand;
    private final JdbcQuery<Price> jdbcQuery;

    public PriceRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcCommand = new JdbcCommand(jdbcTemplate);
        this.jdbcQuery = new JdbcQuery<>(jdbcTemplate, new PriceRowMapper());
    }

    @Override
    public Price select(String name, String createdOn) {
        return jdbcQuery.조회(PriceSQL.select, name, createdOn);
    }

    @Override
    public void insert(PriceReqDto dto) {
        jdbcCommand.실행(PriceSQL.insert, dto.name(), dto.marketPrice(), dto.loadingPrice(), dto.lotPrice(), dto.createdOn());
    }

    @Override
    public void update(PriceReqDto dto) {
        jdbcCommand.실행(PriceSQL.update, dto.marketPrice(), dto.loadingPrice(), dto.lotPrice(), dto.name(), dto.createdOn());
    }
}
