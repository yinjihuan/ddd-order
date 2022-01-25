package com.cxytiandi.ddd.order.application.phase.placeorder.step;

import com.cxytiandi.ddd.order.application.context.PlaceOrderContext;
import com.cxytiandi.ddd.order.domain.goods.valueobject.Sku;
import com.cxytiandi.ddd.order.domain.risk.external.RiskExternalService;
import com.cxytiandi.ddd.order.domain.risk.valueobject.RiskCheckRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 下单风控前置校验
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 16:36
 */
@Component
public class PlaceOrderRiskPreCheckStep {

    @Autowired
    private RiskExternalService riskExternalService;

    public void preCheckRisk(PlaceOrderContext context) {
        RiskCheckRequest request = new RiskCheckRequest();

        request.setBuyerId(context.getBuyer().getUserId());
        request.setMobile(context.getBuyer().getMobile());
        request.setReceiveAddress(context.getAddress().getReceiveAddress());
        request.setReceiveMobile(context.getAddress().getReceiveMobile());
        request.setSkus(buildRiskCheckSkus(context.getSkus()));

        riskExternalService.riskCheck(request);
    }

    private List<RiskCheckRequest.Sku> buildRiskCheckSkus(List<Sku> skus) {
        return skus.stream().map(sku -> {
            RiskCheckRequest.Sku riskCheckSku = new RiskCheckRequest.Sku();
            riskCheckSku.setSkuId(sku.getSkuId());
            riskCheckSku.setSkuName(sku.getSkuName());
            return riskCheckSku;
        }).collect(Collectors.toList());
    }

}
