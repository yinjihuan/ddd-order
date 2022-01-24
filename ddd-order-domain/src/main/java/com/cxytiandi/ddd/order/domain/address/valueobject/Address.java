package com.cxytiandi.ddd.order.domain.address.valueobject;

import lombok.Data;

/**
 * 地址信息
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-24 22:57
 */
@Data
public class Address {

    /**
     * 收货地址
     */
    private String receiveAddress;

    /**
     * 收货号码
     */
    private String receiveMobile;

}
