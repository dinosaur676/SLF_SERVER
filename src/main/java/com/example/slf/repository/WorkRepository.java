package com.example.slf.repository;

import com.example.framework.jdbc.JdbcCommand;
import com.example.framework.jdbc.JdbcQuery;
import com.example.slf.adapter.rdb.mapper.WorkRowMapper;
import com.example.slf.adapter.rdb.sql.WorkSQL;
import com.example.slf.dto.Work;
import com.example.slf.dto.request.UpdateDateReqDto;
import com.example.slf.dto.request.work.WorkDeleteReqDto;
import com.example.slf.dto.request.work.WorkInsertReqDto;
import com.example.slf.dto.request.work.WorkUpdateReqDto;
import com.example.slf.repository.virtual.IWorkRepository;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkRepository implements IWorkRepository {

    final JdbcCommand jdbcCommand;
    final JdbcQuery<Work> jdbcQuery;

    WorkRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcCommand = new JdbcCommand(jdbcTemplate);
        this.jdbcQuery = new JdbcQuery<>(jdbcTemplate, new WorkRowMapper());
    }

    @Override
    public List<Work> select(String createdOn) {
        return jdbcQuery.목록조회(WorkSQL.select, createdOn);
    }

    @Override
    public Work selectById(long id) {
        return jdbcQuery.조회(WorkSQL.selectById, id);
    }

    @Override
    public void insert(WorkInsertReqDto dto) {
        jdbcCommand.실행(WorkSQL.insert, dto.name(), dto.workTime(), dto.size(), dto.count(), dto.price(), dto.createdOn());
    }

    @Override
    public void update(WorkUpdateReqDto dto) {
        jdbcCommand.실행(WorkSQL.update, dto.name(), dto.workTime(), dto.size(), dto.count(), dto.price(), dto.id());

    }

    @Override
    public void updateDate(UpdateDateReqDto dto) {
        jdbcCommand.실행(WorkSQL.updateDate, dto.after(), dto.before());
    }

    @Override
    public void delete(WorkDeleteReqDto dto) {
        jdbcCommand.실행(WorkSQL.delete, dto.id());
    }
}
