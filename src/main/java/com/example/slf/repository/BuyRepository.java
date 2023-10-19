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
    public Buy selectOne(String name, String buyTime, int size, String createdOn) {
        return jdbcQuery.조회(BuySQL.selectOne, name, buyTime, size, createdOn);
    }

    @Override
    public Buy selectById(long id) {
        return jdbcQuery.조회(BuySQL.selectById, id);
    }

    @Override
    public void insert(BuyInsertReqDto dto) {
        jdbcCommand.실행(BuySQL.insert, dto.buyName(), dto.buyTime(), dto.size(), dto.count(), dto.price(), dto.total(), dto.createdOn());
    }

    @Override
    public void update(BuyUpdateReqDto dto) {
        jdbcCommand.실행(BuySQL.update, dto.buyName(), dto.buyTime(), dto.size(), dto.count(), dto.price(), dto.total(), dto.id());
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
