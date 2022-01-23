package com.cxytiandi.ddd.order.infrastructure.external.stock;

import com.cxytiandi.ddd.order.domain.stock.external.StockExternalService;
import com.cxytiandi.ddd.order.domain.stock.valueobject.StockDeductRequest;
import com.cxytiandi.ddd.order.domain.stock.valueobject.StockDeductResponse;
import com.cxytiandi.ddd.order.infrastructure.adapter.stock.StockAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockExternalServiceImpl implements StockExternalService {

    @Autowired
    private StockAdapter stockAdapter;

    @Override
    public List<StockDeductResponse> batchDeductStock(List<StockDeductRequest> stockDeductRequests) {
        return stockAdapter.batchDeductStock(stockDeductRequests);
    }

}
