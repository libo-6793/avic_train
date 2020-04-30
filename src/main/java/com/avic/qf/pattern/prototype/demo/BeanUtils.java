package com.avic.qf.pattern.prototype.demo;

import java.lang.reflect.Field;

/**
 * Created by LiBo.
 */
public class BeanUtils {

    public static Object copy(Object protorype) {
        Class clazz = protorype.getClass();
        Object returnValue = null;
        try {
            returnValue = clazz.newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                field.set(returnValue, field.get(protorype));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return returnValue;
    }
}
