package com.example.slf.repository;

import com.example.framework.jdbc.JdbcCommand;
import com.example.framework.jdbc.JdbcQuery;
import com.example.slf.adapter.rdb.mapper.CompanyRowMapper;
import com.example.slf.adapter.rdb.sql.CompanySQL;
import com.example.slf.dto.Company;
import com.example.slf.dto.request.company.CompanyReqDto;
import com.example.slf.dto.request.company.CompanyUpdateReqDto;
import com.example.slf.repository.virtual.ICompanyRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyRepository implements ICompanyRepository {

    final JdbcCommand jdbcCommand;
    final JdbcQuery<Company> jdbcQuery;

    CompanyRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcCommand = new JdbcCommand(jdbcTemplate);
        this.jdbcQuery = new JdbcQuery<>(jdbcTemplate, new CompanyRowMapper());
    }

    @Override
    public List<Company> select() {
        return jdbcQuery.목록조회(CompanySQL.select);
    }

    @Override
    public List<Company> selectByName(String name) {
        return jdbcQuery.목록조회(CompanySQL.selectByName.formatted("%" + name + "%"));
    }

    @Override
    public Company selectOne(String name) {
        return jdbcQuery.조회(CompanySQL.selectOne, name);
    }

    @Override
    public void update(CompanyUpdateReqDto dto) {
        jdbcCommand.실행(CompanySQL.update, dto.after(), dto.before());
    }

    @Override
    public void insert(CompanyReqDto dto) {
        jdbcCommand.실행(CompanySQL.insert, dto.name());
    }
    @Override
    public void delete(CompanyReqDto dto) {
        jdbcCommand.실행(CompanySQL.delete, dto.id());
    }
}
