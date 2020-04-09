package com.avic.qf.design.principle.dependencyInversion.v4;

/**
 * Created by LB on 2020/3/31
 */
public class Test {
    public static void main(String[] args) {

        Tom tom = new Tom();
        tom.setIcourse(new JavaCourse());
        tom.study();
    }
}
