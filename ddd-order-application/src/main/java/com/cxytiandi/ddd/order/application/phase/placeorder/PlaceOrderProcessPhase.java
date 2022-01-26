package com.cxytiandi.ddd.order.application.phase.placeorder;

import com.cxytiandi.ddd.order.application.context.PlaceOrderContext;
import com.cxytiandi.ddd.order.application.phase.placeorder.step.DeductStockStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 下单执行阶段
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 19:57
 */
@Component
public class PlaceOrderProcessPhase {

    @Autowired
    private DeductStockStep deductStockStep;

    public void process(PlaceOrderContext context) {
        // 扣库存
        deductStockStep.deductStock(context);

        // 核销优惠


        // 获取运费
    }

}
