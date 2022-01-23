package com.cxytiandi.ddd.order.domain.stock.valueobject;

import lombok.Data;

/**
 * 库存扣减结果
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 20:53
 */
@Data
public class StockDeductResponse {

    /**
     * 库存编号
     */
    private String stockNo;

    /**
     * 扣减结果
     */
    private boolean deductResult;

    /**
     * 扣减流水序号
     */
    private String deductSeqNo;
}
