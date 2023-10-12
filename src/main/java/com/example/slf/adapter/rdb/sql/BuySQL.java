package com.example.slf.adapter.rdb.sql;

public class BuySQL {
    static public final String select = "select * from buy where created_on = ?";
    static public final String insert = """
                insert into buy(name, buy_time, size, count, price, created_on)
                values(?, ?, ?, ?, ?, ?)
            """;

    static public final String update = """
                update buy
                set name = ?, buy_time = ?, size = ?, count = ?, price = ?
                where id = ?
            """;
    static public final String updateDate = """
                update buy
                set created_on = ?
                where created_on = ?
            """;
    static public final String delete = "delete from buy where id = ?";

}
