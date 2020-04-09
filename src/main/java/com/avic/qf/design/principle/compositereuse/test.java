package com.avic.qf.design.principle.compositereuse;

/**
 * Created by LB on 2020/4/6
 */
public class test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        //productDao.setDbConnection(new MysqlConnection());
        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();

    }
}
