package com.cxytiandi.ddd.order.application.phase.placeorder.step;

import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import com.cxytiandi.ddd.order.application.context.PlaceOrderContext;
import com.cxytiandi.ddd.order.domain.goods.external.SkuExternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品信息初始化
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-25 22:25
 */
@Component
public class SkuInfoInitStep {

    @Autowired
    private SkuExternalService skuExternalService;

    public void initSkuInfo(PlaceOrderContext context) {
        List<Long> skuIds = context.getPlaceOrderCommand().getSkus().stream().map(PlaceOrderCommand.PlaceOrderSku::getSkuId).collect(Collectors.toList());
        context.setSkus(skuExternalService.batchQuerySkus(skuIds));
    }
}
