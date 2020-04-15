package com.avic.qf.pattern.factory.factoryMethod.method;


import com.avic.qf.pattern.factory.factoryMethod.ICourse;
import com.avic.qf.pattern.factory.factoryMethod.JavaCourse;

/**
 * Created by LiBo.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
