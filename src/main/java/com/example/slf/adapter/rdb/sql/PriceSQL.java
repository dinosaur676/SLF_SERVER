package com.example.slf.adapter.rdb.sql;

public class PriceSQL {
    public static final String select = "select * from price where name = ? and created_on = ?";
    public static final String insert = "insert into price(name, market_price, loading_price, lot_price, created_on) values(?, ?, ?, ?, ?)";
    public static final String update = "update price set market_price = ?, loading_price = ?, lot_price = ? where name = ? and created_on = ?";
}
