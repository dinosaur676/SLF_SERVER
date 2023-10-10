package com.example.framework.jdbc;

import com.example.framework.exception.RepositoryException;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCommand {
    private JdbcTemplate jdbcTemplate;
    public JdbcCommand(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int 실행(String sql, Object... args) {
        try {
            return this.jdbcTemplate.update(sql, args);
        } catch (Exception e) {
            throw new RepositoryException(e, e.getMessage());
        }
    }
}
