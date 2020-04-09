package com.avic.qf.design.principle.compositereuse;

/**
 * Created by LB on 2020/4/6
 */
public class ProductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("获得数据库链接");
    }

}
