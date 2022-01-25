package com.cxytiandi.ddd.order.domain.goods.external;

import com.cxytiandi.ddd.order.domain.goods.valueobject.Sku;

import java.util.List;

/**
 * SKU外部服务
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-25 22:26
 */
public interface SkuExternalService {

    List<Sku> batchQuerySkus(List<Long> skuIds);

}
