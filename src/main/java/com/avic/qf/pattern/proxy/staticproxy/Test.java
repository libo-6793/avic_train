package com.avic.qf.pattern.proxy.staticproxy;

/**
 * Created by LiBo.
 */
public class Test {
    public static void main(String[] args) {
        ZhangLaosan zhangLaosan = new ZhangLaosan(new ZhangSan());
        zhangLaosan.findLove();
    }
}
