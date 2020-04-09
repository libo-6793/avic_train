package com.avic.qf.design.principle.compositereuse;

/**
 * Created by LB on 2020/4/6
 */
public class MysqlConnection extends DBConnection {

    public String getConnection() {
        return "获取Mysql链接";
    }
}
