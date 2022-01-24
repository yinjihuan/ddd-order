package com.cxytiandi.ddd.order.application.phase.placeorder.step;

import com.cxytiandi.ddd.order.application.context.PlaceOrderContext;
import com.cxytiandi.ddd.order.domain.address.external.AddressExternalService;
import com.cxytiandi.ddd.order.domain.buyer.external.BuyerExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 地址信息初始化
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 22:01
 */
@Component
public class AddressInfoInitStep {

    @Autowired
    private AddressExternalService addressExternalService;

    public void initBuyerInfo(PlaceOrderContext context) {
        Long buyerId = context.getPlaceOrderCommand().getUserId().getValue();
        Long addressId = context.getPlaceOrderCommand().getAddressId().getValue();
        context.setAddress(addressExternalService.getAddress(buyerId, addressId));
    }

}
