package com.avic.qf.pattern.decorator.battercake.v1;

/**
 * Created by LiBo.
 */
public class BattercakeWithEgg extends Battercake {

    protected String getMsg(){ return super.getMsg() + "+1个鸡蛋";}

    public int getPrice(){ return super.getPrice() + 1;}

}
