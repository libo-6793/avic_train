package com.avic.qf.pattern.factory.abstractfactory.abstractmethod;

/**
 * Created by LiBo.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();

    }

}
