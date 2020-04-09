package com.avic.qf.design.principle.simpleResponsbility.simple;

/**
 * Created by LB on 2020/4/2
 */
public class Course {
    public void study(String courseName){
        if("直播课".equals(courseName)){
            System.out.println("不能快进");
        }else if ("录播课".equals(courseName)){
            System.out.println("可以快进");
        }
    }
}
