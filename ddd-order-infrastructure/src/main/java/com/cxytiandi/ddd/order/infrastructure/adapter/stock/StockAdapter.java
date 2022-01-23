package com.cxytiandi.ddd.order.infrastructure.adapter.stock;

import com.cxytiandi.ddd.order.domain.stock.valueobject.StockDeductRequest;
import com.cxytiandi.ddd.order.domain.stock.valueobject.StockDeductResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * 库存适配
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 21:46
 */
@Component
public class StockAdapter {

    public List<StockDeductResponse> batchDeductStock(List<StockDeductRequest> stockDeductRequests) {
        // 调用库存提供的接口，进行防腐处理
        // mock data
        return stockDeductRequests.stream().map(req -> {
            StockDeductResponse resp = new StockDeductResponse();
            resp.setStockNo(req.getStockNo());
            resp.setDeductResult(true);
            resp.setDeductSeqNo(UUID.randomUUID().toString());
            return resp;
        }).collect(Collectors.toList());
    }

}
