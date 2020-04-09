package com.avic.qf.design.principle.dependencyInversion.v1;

public class Test {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.studyJava();
        tom.studyPython();
    }
}
