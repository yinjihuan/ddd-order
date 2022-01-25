package com.cxytiandi.ddd.order.domain.risk.valueobject;

import lombok.Data;

import java.util.List;

/**
 * 风控校验请求
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-24 22:42
 */
@Data
public class RiskCheckRequest {
    /**
     * 买家ID
     */
    private Long buyerId;

    /**
     * 买家手机
     */
    private String mobile;

    /**
     * 收货地址
     */
    private String receiveAddress;

    /**
     * 收货号码
     */
    private String receiveMobile;

    /**
     * 购买的商品
     */
    private List<Sku> skus;

    @Data
    public static class Sku {

        /**
         * SKU
         */
        private Long skuId;

        /**
         * 名称
         */
        private String skuName;

    }
}
