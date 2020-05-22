package com.avic.qf.pattern.strategy.promotion;

/**
 * Created by LiBo.
 */
public class Test {
    public static void main(String[] args) {
        String promotion = "";
        IPromotionStrategy strategy = null;
        //PromotionActivity promotionActivity = null;
        if("团购".equals(promotion)){
            strategy=new GroupbuyStrategy();
            strategy.doPromotion();
            /*promotionActivity = new PromotionActivity(new GroupbuyStrategy());
            promotionActivity.excute();
            */
        }else if("返现".equals(promotion)){
            strategy=new CashbackStrategy();
            strategy.doPromotion();
        }

        PromotionActivity activity = new PromotionActivity(new GroupbuyStrategy());
        activity.execute();
        /*PromotionStrategyFacory.getPromotionKeys();
        String promotionKey = "COUPON";

        IPromotionStrategy promotionStrategy = PromotionStrategyFacory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();*/
    }
}
