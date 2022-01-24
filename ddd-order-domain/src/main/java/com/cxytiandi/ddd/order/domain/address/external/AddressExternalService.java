package com.cxytiandi.ddd.order.domain.address.external;

import com.cxytiandi.ddd.order.domain.address.valueobject.Address;

/**
 * 地址外部服务
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-24 22:57
 */
public interface AddressExternalService {

    Address getAddress(Long userId, Long addressId);

}
