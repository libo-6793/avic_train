package com.avic.qf.design.principle.openclose.v1;

public class OpenCloseTest {
    public static void main(String[] args) {
        IProduct product = new ProductA(1,"产品Ａ",2000D);
        System.out.println("产品id："+product.getId()+
                "\n产品名称："+product.getName()+
                "\n产品价格："+product.getPrice());

        IProduct product2 = new DiscountProductA(1,"产品Ａ",2000D);
        DiscountProductA discountProductA = (DiscountProductA)product2;
        /*System.out.println("产品id："+discountProductA.getId()+
                "\n产品名称："+discountProductA.getName()+
                "\n产品原价："+discountProductA.getPrice()+
                "\n产品现价："+discountProductA.getDiscountPrice());*/
    }
}
