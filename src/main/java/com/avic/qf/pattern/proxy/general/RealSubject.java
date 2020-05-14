package com.avic.qf.pattern.proxy.general;

/**
 * Created by LiBo.
 */
public class RealSubject implements ISubject {

    public void request() {
        System.out.println("real service is called.");
    }

}
