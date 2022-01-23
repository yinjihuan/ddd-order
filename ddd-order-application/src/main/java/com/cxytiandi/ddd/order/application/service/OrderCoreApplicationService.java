package com.cxytiandi.ddd.order.application.service;

import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import com.cxytiandi.ddd.order.application.dto.PlaceOrderDto;

/**
 * 订单核心-应用Service
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 14:03
 */
public interface OrderCoreApplicationService {

    /**
     * 下单
     * @param command
     * @return
     */
    PlaceOrderDto placeOrder(PlaceOrderCommand command);

}
