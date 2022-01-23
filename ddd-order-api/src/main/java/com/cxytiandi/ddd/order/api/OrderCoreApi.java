package com.cxytiandi.ddd.order.api;

import com.alibaba.cola.dto.SingleResponse;
import com.cxytiandi.ddd.order.api.request.PlaceOrderRequest;
import com.cxytiandi.ddd.order.api.response.PlaceOrderResponse;

/**
 * 订单核心接口
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 12:12
 */
public interface OrderCoreApi {

    /**
     * 下单
     * @param request
     * @return
     */
    SingleResponse<PlaceOrderResponse> placeOrder(PlaceOrderRequest request);

}
