package com.avic.qf.design.principle.dependencyInversion.v2;

/**
 * Created by LB on 2020/3/31
 */
public class Test {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.study(new JavaCourse());
        tom.study(new PythonCourse());
    }
}
