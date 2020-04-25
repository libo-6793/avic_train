package com.avic.qf.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LB on 2020/4/2
 */
public class TeamLeader {
    public void commandCheckCourseNum(Employee employee){
        employee.checkNumOfCourse();
    }
}
