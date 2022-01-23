package com.cxytiandi.ddd.order.api.response;

import lombok.Data;

import java.util.List;

/**
 * 下单响应
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 13:19
 */
@Data
public class PlaceOrderResponse {

    /**
     * 成功的订单号
     */
    private List<String> orderNos;

}
