package com.avic.qf.design.principle.liskovsubtution.improve;

/**
 * Created by LB on 2020/4/6
 */
public class Square implements Quadrangle {
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return length;
    }

    public long getHeight() {
        return length;
    }
}
