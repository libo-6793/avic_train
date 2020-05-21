package com.avic.qf.pattern.strategy.promotion;

/**
 * Created by LiBo.
 */
public class EmptyStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
