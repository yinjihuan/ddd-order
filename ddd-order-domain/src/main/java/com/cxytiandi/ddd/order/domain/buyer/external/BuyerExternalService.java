package com.cxytiandi.ddd.order.domain.buyer.external;

import com.cxytiandi.ddd.order.domain.buyer.valueobject.Buyer;

/**
 * 买家信息
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 22:18
 */
public interface BuyerExternalService {

    Buyer getBuyer(Long buyerId);

}
