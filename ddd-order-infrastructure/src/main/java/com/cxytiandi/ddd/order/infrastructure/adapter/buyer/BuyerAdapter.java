package com.cxytiandi.ddd.order.infrastructure.adapter.buyer;

import com.cxytiandi.ddd.order.domain.buyer.valueobject.Buyer;
import org.springframework.stereotype.Component;

/**
 * 买家信息适配
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 22:22
 */
@Component
public class BuyerAdapter {

    public Buyer getBuyer(Long buyerId) {
        // 调用用户提供的接口，进行防腐处理
        // mock data
        Buyer buyer = new Buyer();
        buyer.setUserId(1001L);
        buyer.setMobile("183xxxx1111");
        buyer.setName("yinjihuan");
        return buyer;
    }
}
