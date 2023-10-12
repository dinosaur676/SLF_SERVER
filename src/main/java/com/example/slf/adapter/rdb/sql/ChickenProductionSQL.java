package com.example.slf.adapter.rdb.sql;

public class ChickenProductionSQL {
    public static final String selectAll = "select * from chicken where parts = ? and create_on = ?";
    public static final String insert = "insert into chicken_production(parts, name, count, price, total, type, created_on) values(?, ?, ?, ?, ?, ?, ?)";
    public static final String delete = "delete from chicken_production where id = ?";
    public static final String update = """
                update chicken_production
                set name = ?, count = ?, price = ?, total = ?, type = ?,
                where id = ?;
            """;
    public static final String updateData = """
                update chicken_production
                set created_on = ?,
                where created_on = ?,
            """;
}
