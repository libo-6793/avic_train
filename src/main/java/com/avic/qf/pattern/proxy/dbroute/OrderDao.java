package com.avic.qf.pattern.proxy.dbroute;

/**
 * Created by LiBo.
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
