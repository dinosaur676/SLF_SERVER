package com.example.slf.repository;


import com.example.framework.jdbc.JdbcCommand;
import com.example.framework.jdbc.JdbcQuery;
import com.example.slf.adapter.rdb.mapper.ChickenProductionRowMapper;
import com.example.slf.adapter.rdb.mapper.ChickenSellRowMapper;
import com.example.slf.adapter.rdb.sql.ChickenProductionSQL;
import com.example.slf.adapter.rdb.sql.ChickenSellSQL;
import com.example.slf.dto.ChickenProduction;
import com.example.slf.dto.ChickenSell;
import com.example.slf.dto.request.chicken.sell.ChickenSellDeleteReqDto;
import com.example.slf.dto.request.chicken.sell.ChickenSellInsertReqDto;
import com.example.slf.dto.request.chicken.sell.ChickenSellUpdateReqDto;
import com.example.slf.dto.request.date.DeleteDateReqDto;
import com.example.slf.dto.request.date.UpdateDateReqDto;
import com.example.slf.repository.virtual.IChickenSellRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChickenSellRepository implements IChickenSellRepository {
    private final JdbcCommand jdbcCommand;
    private final JdbcQuery<ChickenSell> jdbcQuery;

    public ChickenSellRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcCommand = new JdbcCommand(jdbcTemplate);
        this.jdbcQuery = new JdbcQuery<>(jdbcTemplate, new ChickenSellRowMapper());
    }

    @Override
    public List<ChickenSell> select(String parts, String createdOn) {
        return jdbcQuery.목록조회(ChickenSellSQL.select, parts, createdOn);
    }

    @Override
    public List<ChickenSell> selectByProdId(long id) {
        return jdbcQuery.목록조회(ChickenSellSQL.selectByProdId, id);
    }

    @Override
    public void insert(ChickenSellInsertReqDto dto) {
        jdbcCommand.실행(ChickenSellSQL.insert, dto.parts(), dto.name(), dto.count(),
                dto.price(), dto.total(), dto.createdOn(), dto.type(),dto.prodId());
    }

    @Override
    public void update(ChickenSellUpdateReqDto dto) {
        jdbcCommand.실행(ChickenSellSQL.update, dto.name(), dto.count(), dto.price(), dto.total(), dto.type(), dto.id());
    }

    @Override
    public void updateDate(UpdateDateReqDto dto) {
        jdbcCommand.실행(ChickenSellSQL.updateDate, dto.after(), dto.before());
    }

    @Override
    public void delete(ChickenSellDeleteReqDto dto) {
        jdbcCommand.실행(ChickenSellSQL.delete, dto.id());
    }
    @Override
    public void deleteDate(DeleteDateReqDto dto) {
        jdbcCommand.실행(ChickenSellSQL.deleteDate, dto.createdOn());
    }
}
