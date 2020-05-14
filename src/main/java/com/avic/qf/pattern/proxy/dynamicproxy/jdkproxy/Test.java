package com.avic.qf.pattern.proxy.dynamicproxy.jdkproxy;


/**
 * Created by LiBo on 2020/05/14.
 */
public class Test {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();
        zhangsan.buyInsure();


        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
        zhaoliu.findLove();

    }
}
