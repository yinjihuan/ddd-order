package com.cxytiandi.ddd.order.application.phase.placeorder.step;

import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import com.cxytiandi.ddd.order.application.context.PlaceOrderContext;
import com.cxytiandi.ddd.order.domain.stock.external.StockExternalService;
import com.cxytiandi.ddd.order.domain.stock.valueobject.StockDeductRequest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 扣减库存
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 20:07
 */
@Component
public class DeductStockStep {

    private StockExternalService stockExternalService;

    public void deductStock(PlaceOrderContext context) {
        PlaceOrderCommand command = context.getPlaceOrderCommand();

        List<StockDeductRequest> stockDeductRequests = new ArrayList<>();

        stockExternalService.batchDeductStock(stockDeductRequests);
    }
}
