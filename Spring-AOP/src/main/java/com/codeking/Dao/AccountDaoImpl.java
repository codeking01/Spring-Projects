package com.codeking.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author : codeking
 * @date : 2022/11/17 21:36
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addMoney() {
        String sql = "update `account` set money =money +? where id =?";
        jdbcTemplate.update(sql,100,1);
    }

    public void reduceMoney() {
        String sql = "update `account` set money =money - ? where id =?";
        jdbcTemplate.update(sql,100,2);
    }
}
