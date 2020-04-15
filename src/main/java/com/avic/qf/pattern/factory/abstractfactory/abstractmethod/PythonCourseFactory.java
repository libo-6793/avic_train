package com.avic.qf.pattern.factory.abstractfactory.abstractmethod;


import com.avic.qf.pattern.factory.abstractfactory.INote;
import com.avic.qf.pattern.factory.abstractfactory.IVideo;
import com.avic.qf.pattern.factory.abstractfactory.PythonNote;
import com.avic.qf.pattern.factory.abstractfactory.PythonVideo;

/**
 * Created by LiBo.
 */
public class PythonCourseFactory extends CourseFactory {

    public INote createNote() {
        super.init();
        return new PythonNote();
    }


    public IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
