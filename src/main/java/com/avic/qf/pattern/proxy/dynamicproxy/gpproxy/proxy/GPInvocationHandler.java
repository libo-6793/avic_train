package com.avic.qf.pattern.proxy.dynamicproxy.gpproxy.proxy;

import java.lang.reflect.Method;

/**
 * Created by LiBo on 2020/05/14.
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
