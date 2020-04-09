package com.avic.qf.design.principle.dependencyInversion.v2;

/**
 * Created by LB on 2020/3/31
 */
public class Tom {
    public void study(ICourse course){
        course.study();
    }
}
