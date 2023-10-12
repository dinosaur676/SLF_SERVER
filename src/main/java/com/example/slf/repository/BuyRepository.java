package com.example.slf.repository;

import com.example.framework.jdbc.JdbcCommand;
import com.example.framework.jdbc.JdbcQuery;
import com.example.slf.adapter.rdb.mapper.BuyRowMapper;
import com.example.slf.adapter.rdb.sql.BuySQL;
import com.example.slf.dto.Buy;
import com.example.slf.dto.request.UpdateDateReqDto;
import com.example.slf.dto.request.buy.BuyDeleteReqDto;
import com.example.slf.dto.request.buy.BuyInsertReqDto;
import com.example.slf.dto.request.buy.BuyUpdateReqDto;
import com.example.slf.repository.virtual.IBuyRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BuyRepository implements IBuyRepository {

    final JdbcCommand jdbcCommand;
    final JdbcQuery<Buy> jdbcQuery;

    BuyRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcCommand = new JdbcCommand(jdbcTemplate);
        this.jdbcQuery = new JdbcQuery<>(jdbcTemplate, new BuyRowMapper());
    }

    @Override
    public List<Buy> select(String createdOn) {
        return jdbcQuery.목록조회(BuySQL.select, createdOn);
    }

    @Override
    public void insert(BuyInsertReqDto dto) {
        jdbcCommand.실행(BuySQL.insert, dto.name(), dto.buyTime(), dto.size(), dto.count(), dto.price(), dto.createdOn());
    }

    @Override
    public void update(BuyUpdateReqDto dto) {
        jdbcCommand.실행(BuySQL.update, dto.name(), dto.buyTime(), dto.size(), dto.count(), dto.price(), dto.id());
    }

    @Override
    public void updateDate(UpdateDateReqDto dto) {
        jdbcCommand.실행(BuySQL.updateDate, dto.after(), dto.before());
    }

    @Override
    public void delete(BuyDeleteReqDto dto) {
        jdbcCommand.실행(BuySQL.delete, dto.id());
    }
}
