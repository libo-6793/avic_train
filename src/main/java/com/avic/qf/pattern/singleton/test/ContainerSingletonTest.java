package com.avic.qf.pattern.singleton.test;


import com.avic.qf.pattern.singleton.register.ContainerSingleton;

/**
 * Created by LiBo.
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object instance1 = ContainerSingleton.getInstance("com.avic.qf.pattern.singleton.test.Pojo");
        Object instance2 = ContainerSingleton.getInstance("com.avic.qf.pattern.singleton.test.Pojo");
        System.out.println(instance1 == instance2);
    }
}
