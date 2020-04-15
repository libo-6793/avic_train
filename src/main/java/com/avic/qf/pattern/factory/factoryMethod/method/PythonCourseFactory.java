package com.avic.qf.pattern.factory.factoryMethod.method;

import com.avic.qf.pattern.factory.factoryMethod.ICourse;
import com.avic.qf.pattern.factory.factoryMethod.PythonCourse;

/**
 * Created by LiBo.
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
