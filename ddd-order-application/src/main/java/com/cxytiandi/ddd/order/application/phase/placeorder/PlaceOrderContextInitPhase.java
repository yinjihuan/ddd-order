package com.cxytiandi.ddd.order.application.phase.placeorder;

import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import com.cxytiandi.ddd.order.application.context.PlaceOrderContext;
import com.cxytiandi.ddd.order.application.phase.placeorder.step.BuyerInfoInitStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 下单上下文初始化
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 16:41
 */
@Component
public class PlaceOrderContextInitPhase {

    @Autowired
    private BuyerInfoInitStep buyerInfoInitStep;

    public PlaceOrderContext init(PlaceOrderCommand command) {
        PlaceOrderContext context = new PlaceOrderContext();
        context.setPlaceOrderCommand(command);

        buyerInfoInitStep.initBuyerInfo(context);
        return context;
    }

}
