package com.cxytiandi.ddd.order.domain.stock.external;

import com.cxytiandi.ddd.order.domain.stock.valueobject.StockDeductRequest;
import com.cxytiandi.ddd.order.domain.stock.valueobject.StockDeductResponse;

import java.util.List;

/**
 * 库存外部服务
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 21:01
 */
public interface StockExternalService {

    List<StockDeductResponse> batchDeductStock(List<StockDeductRequest> stockDeductRequests);

}
