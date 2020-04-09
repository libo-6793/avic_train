package com.avic.qf.design.principle.liskovsubtution.improve;

/**
 * Created by LB on 2020/4/6
 */
public class Rectangle implements Quadrangle {

    private long height;
    private long width;

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
