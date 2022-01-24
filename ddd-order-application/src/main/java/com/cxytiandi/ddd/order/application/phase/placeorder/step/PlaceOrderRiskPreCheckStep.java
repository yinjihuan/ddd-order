package com.cxytiandi.ddd.order.application.phase.placeorder.step;

import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import com.cxytiandi.ddd.order.application.context.PlaceOrderContext;
import com.cxytiandi.ddd.order.domain.risk.external.RiskExternalService;
import com.cxytiandi.ddd.order.domain.risk.valueobject.RiskCheckRequest;
import com.cxytiandi.ddd.order.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 下单风控前置校验
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 16:36
 */
@Component
public class PlaceOrderRiskPreCheckStep {

    @Autowired
    private RiskExternalService riskExternalService;

    public void preCheckRisk(PlaceOrderContext context) {
        RiskCheckRequest request = new RiskCheckRequest();

        request.setBuyerId(context.getBuyer().getUserId());
        request.setMobile(context.getBuyer().getMobile());
        request.setReceiveAddress(context.getAddress().getReceiveAddress());
        request.setReceiveMobile(context.getAddress().getReceiveMobile());

        riskExternalService.riskCheck(request);
    }

}
