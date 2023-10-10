package com.example.slf.adapter.rdb.sql;

public class PriceSQL {
    public static final String select = "select * from price where create_on = ?";
    public static final String insert = "insert into price(market_price, loading_price, lot_price, create_on) values(?, ?, ?, ?)";

    public static final String update = "update price set market_price = ?, loading_price = ?, lot_price = ? where create_on = ?";
}
