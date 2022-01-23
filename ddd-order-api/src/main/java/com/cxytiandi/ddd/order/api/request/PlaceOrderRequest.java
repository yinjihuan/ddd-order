package com.cxytiandi.ddd.order.api.request;

import lombok.Data;

import java.util.List;

/**
 * 下单参数
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 13:21
 */
@Data
public class PlaceOrderRequest {

    /**
     * 用户
     */
    private Long userId;

    /**
     * 下单的商品
     */
    private List<PlaceOrderSku> skus;

    /**
     * 总金额，确认订单页看到的金额
     */
    private Long totalAmount;

    public static class PlaceOrderSku {

        /**
         * SKU
         */
        private Long skuId;

        /**
         * 购买数量
         */
        private Integer quantity;

    }
}
