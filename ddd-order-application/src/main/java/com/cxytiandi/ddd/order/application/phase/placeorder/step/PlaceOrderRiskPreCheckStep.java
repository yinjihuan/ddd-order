package com.cxytiandi.ddd.order.application.phase.placeorder.step;

import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import com.cxytiandi.ddd.order.exception.ValidationException;
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

    public void preCheckRisk(PlaceOrderCommand command) {

    }

}
