package com.avic.qf.design.principle.openclose.v1;

public class ProductA implements IProduct{
    private Integer id;
    private String name;
    private Double price;

    public ProductA(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

}
