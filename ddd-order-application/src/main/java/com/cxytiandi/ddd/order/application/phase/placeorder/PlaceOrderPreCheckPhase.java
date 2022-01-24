package com.cxytiandi.ddd.order.application.phase.placeorder;

import com.cxytiandi.ddd.order.application.context.PlaceOrderContext;
import com.cxytiandi.ddd.order.application.phase.placeorder.step.PlaceOrderBasicParametersCheckStep;
import com.cxytiandi.ddd.order.application.phase.placeorder.step.PlaceOrderBizCheckStep;
import com.cxytiandi.ddd.order.application.phase.placeorder.step.PlaceOrderRiskPreCheckStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 下单前校验阶段
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 16:03
 */
@Component
public class PlaceOrderPreCheckPhase {

    @Autowired
    private PlaceOrderBasicParametersCheckStep placeOrderBasicParametersCheckStep;

    @Autowired
    private PlaceOrderRiskPreCheckStep placeOrderRiskPreCheckStep;

    @Autowired
    private PlaceOrderBizCheckStep placeOrderBizCheckStep;

    public void check(PlaceOrderContext context) {
        // 下单基础参数校验
        placeOrderBasicParametersCheckStep.checkBasicParameters(context.getPlaceOrderCommand());

        // 下单风控前置校验
        placeOrderRiskPreCheckStep.preCheckRisk(context);

        // 下单的业务校验
        placeOrderBizCheckStep.checkBiz(context.getPlaceOrderCommand());
    }

}
