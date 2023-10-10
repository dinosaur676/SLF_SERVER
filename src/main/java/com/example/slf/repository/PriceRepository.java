package com.example.slf.repository;

import com.example.framework.jdbc.JdbcCommand;
import com.example.framework.jdbc.JdbcQuery;
import com.example.slf.adapter.rdb.mapper.PriceRowMapper;
import com.example.slf.adapter.rdb.sql.PriceSQL;
import com.example.slf.dto.PriceDto;
import com.example.slf.repository.virtual.IPriceRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PriceRepository implements IPriceRepository {

    private final JdbcCommand jdbcCommand;
    private final JdbcQuery<PriceDto> jdbcQuery;

    public PriceRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcCommand = new JdbcCommand(jdbcTemplate);
        this.jdbcQuery = new JdbcQuery<>(jdbcTemplate, new PriceRowMapper());
    }

    @Override
    public PriceDto select(String create_on) {
        return jdbcQuery.조회(PriceSQL.select, create_on);
    }

    @Override
    public void insert(PriceDto dto) {
        jdbcCommand.실행(PriceSQL.insert, dto.getMarketPrice(), dto.getLoadingPrice(), dto.getLotPrice(), dto.getCreateOn());
    }

    @Override
    public void update(PriceDto dto) {
        jdbcCommand.실행(PriceSQL.update, dto.getMarketPrice(), dto.getLoadingPrice(), dto.getLotPrice(), dto.getCreateOn());
    }
}
