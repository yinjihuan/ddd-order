package com.cxytiandi.ddd.order.domain.buyer.valueobject;

import lombok.Data;

/**
 * 用户-买家
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 21:58
 */
@Data
public class Buyer {
    /**
     * ID
     */
    private Long userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机
     */
    private String mobile;
}
