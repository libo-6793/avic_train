package com.avic.qf.pattern.proxy.general;

/**
 * Created by LiBo.
 */
public class Client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();

    }

}
