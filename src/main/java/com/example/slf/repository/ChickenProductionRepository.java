package com.example.slf.repository;

import com.example.framework.jdbc.JdbcCommand;
import com.example.framework.jdbc.JdbcQuery;
import com.example.slf.adapter.rdb.mapper.ChickenProductionRowMapper;
import com.example.slf.adapter.rdb.sql.BuySQL;
import com.example.slf.adapter.rdb.sql.ChickenProductionSQL;
import com.example.slf.dto.ChickenProduction;
import com.example.slf.dto.request.chicken.production.ChickenProductionDeleteDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionInsertDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionUpdateDto;
import com.example.slf.dto.request.date.DeleteDateReqDto;
import com.example.slf.dto.request.date.UpdateDateReqDto;
import com.example.slf.repository.virtual.IChickenProductionRepository;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChickenProductionRepository implements IChickenProductionRepository {

    private final JdbcCommand jdbcCommand;
    private final JdbcQuery<ChickenProduction> jdbcQuery;

    public ChickenProductionRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcCommand = new JdbcCommand(jdbcTemplate);
        this.jdbcQuery = new JdbcQuery<>(jdbcTemplate, new ChickenProductionRowMapper());
    }

    @Override
    public List<ChickenProduction> selectAll(String parts, String createdOn) {
        return jdbcQuery.목록조회(ChickenProductionSQL.selectAll, parts, createdOn);
    }

    @Override
    public List<ChickenProduction> selectJustDate(String createdOn) {
        return jdbcQuery.목록조회(ChickenProductionSQL.selectJustDate, createdOn);
    }

    @Override
    public ChickenProduction selectById(long id) {
        return jdbcQuery.조회(ChickenProductionSQL.selectById, id);
    }

    @Override
    public void insert(ChickenProductionInsertDto dto) {
        jdbcCommand.실행(ChickenProductionSQL.insert, dto.parts(), dto.name(), dto.count(), dto.price(),
                dto.total(), dto.type(), dto.createdOn());
    }

    @Override
    public void delete(ChickenProductionDeleteDto dto) {
        jdbcCommand.실행(ChickenProductionSQL.delete, dto.id());
    }

    @Override
    public void update(ChickenProductionUpdateDto dto) {
        jdbcCommand.실행(ChickenProductionSQL.update, dto.name(), dto.count(), dto.price(), dto.total(), dto.type(), dto.id());
    }

    @Override
    public void updateDate(UpdateDateReqDto dto) {
        jdbcCommand.실행(ChickenProductionSQL.updateData, dto.after(), dto.before());
    }

    @Override
    public void deleteDate(DeleteDateReqDto dto) {
        jdbcCommand.실행(ChickenProductionSQL.deleteDate, dto.createdOn());
    }
}
