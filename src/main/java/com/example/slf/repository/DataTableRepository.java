package com.example.slf.repository;

import com.example.framework.jdbc.JdbcCommand;
import com.example.framework.jdbc.JdbcQuery;
import com.example.slf.adapter.rdb.mapper.DataTableRowMapper;
import com.example.slf.adapter.rdb.sql.DataTableSQL;
import com.example.slf.dto.DataTableDto;
import com.example.slf.repository.virtual.IDataTableRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataTableRepository implements IDataTableRepository {

    private final JdbcCommand jdbcCommand;
    private final JdbcQuery<DataTableDto> jdbcQuery;

    public DataTableRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcCommand = new JdbcCommand(jdbcTemplate);
        this.jdbcQuery = new JdbcQuery<>(jdbcTemplate, new DataTableRowMapper());
    }
    @Override
    public List<DataTableDto> selectAll(String mainkey, String subKey, String time) {
        return jdbcQuery.목록조회(DataTableSQL.selectAll, mainkey, subKey, time);
    }

    @Override
    public void insert(String mainkey, String subKey, DataTableDto dto) {
        jdbcCommand.실행(DataTableSQL.insert, mainkey, subKey, dto.getName(), dto.getCount(), dto.getPrice(), dto.getTotal(), dto.getCreateOn());
    }

    @Override
    public void delete(int id) {
        jdbcCommand.실행(DataTableSQL.delete, id);
    }
}
