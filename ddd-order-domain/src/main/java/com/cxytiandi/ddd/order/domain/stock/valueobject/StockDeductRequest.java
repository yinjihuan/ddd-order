package com.cxytiandi.ddd.order.domain.stock.valueobject;

import lombok.Data;

/**
 * 库存扣减请求
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 21:33
 */
@Data
public class StockDeductRequest {
    /**
     * 库存编号
     */
    private String stockNo;

    /**
     * 扣减数量
     */
    private Integer deductNum;
}
