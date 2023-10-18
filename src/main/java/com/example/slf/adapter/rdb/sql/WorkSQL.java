package com.example.slf.adapter.rdb.sql;

public class WorkSQL {
    static public final String select = "select * from work where created_on = ?";
    static public final String selectById = "select * from work where id = ?";

    static public final String selectByBuyID = "select * from work where buy_id = ?";

    static public final String insert = """
                insert into work(name, work_time, size, count, price, total, created_on, buy_id)
                values(?, ?, ?, ?, ?, ?, ?, ?)
            """;
    static public final String update = """
                update work
                set name = ?, work_time = ?, size = ?, count = ?, price = ?, total = ?
                where id = ?
            """;
    static public final String updateDate = """
                update work
                set created_on = ?
                where created_on = ?
            """;
    static public final String delete = "delete from work where id = ?";
}
