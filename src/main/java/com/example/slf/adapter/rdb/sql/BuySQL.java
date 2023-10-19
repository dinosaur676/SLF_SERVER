package com.example.slf.adapter.rdb.sql;

public class BuySQL {
    static public final String select = """
                select buy.id, buy.name, buy_time, buy.size, buy.count, buy.price, buy.total, buy.created_on, coalesce(cnt, 0) as "cnt"
                from buy left outer join (
                	SELECT buy_id, count(buy_id) as cnt from buy, work where buy.id = work.buy_id group by buy_id
                ) as countTable
                on buy.id = countTable.buy_id
                where buy.created_on = ?
            """;
    static public final String selectOne = """
                select buy.id, buy.name, buy_time, buy.size, buy.count, buy.price, buy.total, buy.created_on, coalesce(cnt, 0) as "cnt"
                from buy left outer join (
                	SELECT buy_id, count(buy_id) as cnt from buy, work where buy.id = work.buy_id group by buy_id
                ) as countTable
                on buy.id = countTable.buy_id
                where buy.name = ? and buy.buy_time = ? and buy.size = ? and buy.created_on = ?
            """;
    static public final String selectById = """
                select buy.id, buy.name, buy_time, buy.size, buy.count, buy.price, buy.total, buy.created_on, coalesce(cnt, 0) as "cnt"
                from buy left outer join (
                	SELECT buy_id, count(buy_id) as cnt from buy, work where buy.id = work.buy_id group by buy_id
                ) as countTable
                on buy.id = countTable.buy_id
                where buy.id = ?
            """;
    static public final String insert = """
                insert into buy(name, buy_time, size, count, price, total, created_on)
                values(?, ?, ?, ?, ?, ?, ?)
            """;

    static public final String update = """
                update buy
                set name = ?, buy_time = ?, size = ?, count = ?, price = ?, total = ?
                where id = ?
            """;
    static public final String updateDate = """
                update buy
                set created_on = ?
                where created_on = ?
            """;
    static public final String delete = "delete from buy where id = ?";

}
