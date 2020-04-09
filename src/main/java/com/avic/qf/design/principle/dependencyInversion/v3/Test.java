package com.avic.qf.design.principle.dependencyInversion.v3;

/**
 * Created by LB on 2020/3/31
 */
public class Test {
    public static void main(String[] args) {

        //-----------v3------------
        Tom tom = new Tom(new JavaCourse());
        tom.study();
    }
}
