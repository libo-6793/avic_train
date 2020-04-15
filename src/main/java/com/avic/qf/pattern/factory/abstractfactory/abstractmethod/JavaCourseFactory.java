package com.avic.qf.pattern.factory.abstractfactory.abstractmethod;


import com.avic.qf.pattern.factory.abstractfactory.INote;
import com.avic.qf.pattern.factory.abstractfactory.IVideo;
import com.avic.qf.pattern.factory.abstractfactory.JavaNote;
import com.avic.qf.pattern.factory.abstractfactory.JavaVideo;

/**
 * Created by LiBo.
 */
public class JavaCourseFactory extends CourseFactory {

    public INote createNote() {
        super.init();
        return new JavaNote();
    }

    public IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
