package com.avic.qf.pattern.factory.simplefactory.simple;


import com.avic.qf.pattern.factory.factoryMethod.method.ICourseFactory;
import com.avic.qf.pattern.factory.simplefactory.ICourse;
import com.avic.qf.pattern.factory.simplefactory.JavaCourse;

import java.util.Calendar;

/**
 * 小作坊式的工厂模型
 * Created by LiBo.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

//        ICourse course = new JavaCourse();
//        course.record();

        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create("java");
        course.record();

//        ICourseFactory factory = new ICourseFactory();
//        ICourse course = factory.create("com.gupaoedu.vip.pattern.factory.JavaCourse");
//        course.record();

//        CourseFactory factory = new CourseFactory();
//        ICourse course = factory.create(JavaCourse.class);
//        course.record();

    }
}
