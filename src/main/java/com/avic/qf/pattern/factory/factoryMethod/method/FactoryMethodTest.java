package com.avic.qf.pattern.factory.factoryMethod.method;


import com.avic.qf.pattern.factory.factoryMethod.ICourse;

/**
 * Created by LiBo.
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();

    }

}
