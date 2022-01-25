package com.cxytiandi.ddd.order.domain.goods.valueobject;

import lombok.Data;

/**
 * SKU
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-25 22:27
 */
@Data
public class Sku {

    /**
     * SKU
     */
    private Long skuId;

    /**
     * 名称
     */
    private String skuName;

    /**
     * 库存编号
     */
    private String stockNo;

}
