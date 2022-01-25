package com.cxytiandi.ddd.order.infrastructure.adapter.goods;

import com.cxytiandi.ddd.order.domain.goods.valueobject.Sku;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * SKU适配
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-25 22:30
 */
@Component
public class SkuAdapter {

    public List<Sku> batchQuerySkus(List<Long> skuIds) {
        return skuIds.stream().map(this::getSku).collect(Collectors.toList());
    }

    public Sku getSku(Long skuId) {
        // 调用商品提供的接口，进行防腐处理
        // mock data
        Sku sku = new Sku();
        sku.setSkuId(skuId);
        sku.setSkuName("小白鞋");
        sku.setStockNo("10029212123");
        return sku;
    }
}
