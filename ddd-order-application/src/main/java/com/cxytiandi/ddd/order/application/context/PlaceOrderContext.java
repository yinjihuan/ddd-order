package com.cxytiandi.ddd.order.application.context;

import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import lombok.Data;

/**
 * 下单上下文
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 16:38
 */
@Data
public class PlaceOrderContext {

    private PlaceOrderCommand placeOrderCommand;

}
