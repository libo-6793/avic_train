package com.avic.qf.design.principle.demeter;

/**
 * Created by LB on 2020/4/2
 */
public class Test {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Employee employee = new Employee();
        teamLeader.commandCheckCourseNum(employee);
    }
}
