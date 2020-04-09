package com.avic.qf.design.principle.demeter;

import java.util.List;

/**
 * Created by LB on 2020/4/2
 */
public class Employee {
    public void checkNumOfCourse(List<Course> courseList){
        System.out.println("课程数量为："+courseList.size());
    }
}
