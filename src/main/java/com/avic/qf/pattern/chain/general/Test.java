package com.avic.qf.pattern.chain.general;

/**
 * Created by LiBo.
 */
public class Test {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNextHanlder(handlerB);
        handlerA.handleRequest("requestB");
    }
}
