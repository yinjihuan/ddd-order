package com.cxytiandi.ddd.order.infrastructure.adapter.address;

import com.cxytiandi.ddd.order.domain.address.valueobject.Address;
import org.springframework.stereotype.Component;

/**
 * 地址适配
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-24 23:00
 */
@Component
public class AddressAdapter {

    public Address getAddress(Long userId, Long addressId) {
        // 调用地址提供的接口，进行防腐处理
        // mock data
        Address address = new Address();
        address.setReceiveMobile("183xxxx0909");
        address.setReceiveAddress("上海市虹口区xxx路xxx弄9号3001室");
        return address;
    }

}
