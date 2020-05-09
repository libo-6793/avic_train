package com.avic.qf.pattern.facade.points;


/**
 * Created by LiBo.
 */
public class Test {

    public static void main(String[] args) {

        FacadeService facadeService = new FacadeService();

        GiftInfo giftInfo = new GiftInfo("《Spring 5核心原理》");

        facadeService.exchange(giftInfo);

    }

}
