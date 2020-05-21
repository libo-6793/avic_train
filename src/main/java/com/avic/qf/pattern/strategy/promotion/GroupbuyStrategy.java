package com.avic.qf.pattern.strategy.promotion;

/**
 * Created by LiBo.
 */
public class GroupbuyStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("5人成团，可以优惠");
    }
}
