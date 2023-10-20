package com.example.slf.adapter.rdb.sql;

public class CompanySQL {
    static public String select = "select * from company";
    static public String selectByName = "select * from company where name LIKE '%s'";
    static public String selectOne = "select * from company where name = ?";
    static public String update = "update company set name = ? where name = ?";
    static public String insert = "insert into company(name) values(?)";
    static public String delete = "delete from company where id = ?";

}
