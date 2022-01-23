package com.cxytiandi.ddd.order.application.phase.placeorder.step;

import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import org.springframework.stereotype.Component;

/**
 * 下单业务校验
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 19:42
 */
@Component
public class PlaceOrderBizCheckStep {

    // todo 扩展点
    public void checkBiz(PlaceOrderCommand command) {

    }

}
