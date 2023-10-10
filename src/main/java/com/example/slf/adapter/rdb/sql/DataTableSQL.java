package com.example.slf.adapter.rdb.sql;

public class DataTableSQL {
    public static final String selectAll = "select * from chicken where main_key = ? and sub_key = ? and create_on = ?";
    public static final String insert = "insert into chicken(main_key, sub_key, name, count, price, total, create_on) values(?, ?, ?, ?, ?, ?, ?)";
    public static final String delete = "delete from chicken where id = ?";
}
