package com.cxytiandi.ddd.order.domain.risk.valueobject;

import lombok.Data;

/**
 * 风控校验结果
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-24 22:40
 */
@Data
public class RiskCheckResponse {

    /**
     * 校验结果
     */
    private boolean result;

    /**
     * 错误信息
     */
    private String message;

}
