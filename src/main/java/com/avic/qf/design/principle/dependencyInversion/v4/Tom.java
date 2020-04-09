package com.avic.qf.design.principle.dependencyInversion.v4;

/**
 * Created by LB on 2020/3/31
 */
public class Tom {
    private ICourse icourse;

 /*   public Tom(ICourse icourse) {
        this.icourse = icourse;
    }*/

    public void setIcourse(ICourse icourse) {
        this.icourse = icourse;
    }

    public void study(){
        icourse.study();
    }
}
