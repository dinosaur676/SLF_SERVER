package com.example.slf.adapter.rdb.sql;

public class ChickenSellSQL {
    static public final String select = "select * from chicken_sell where parts = ? and created_on = ?";
    static public final String selectByProdId = "select * from chicken_sell where prod_id = ?";
    static public final String insert = "insert into chicken_sell(parts, name, count, price, total, created_on, type, prod_id) values(?, ?, ?, ?, ?, ?, ?, ?)";
    static public final String update = """
            update chicken_sell
            set name = ?, count = ?, price = ?, total = ?, type = ?
            where id = ?
            """;
    static public final String updateDate = """
                update buy
                set created_on = ?
                where created_on = ?
            """;
    static public final String delete = "delete from chicken_sell where id = ?";

    static public final String deleteDate = "delete from buy where created_on = ?";
}
