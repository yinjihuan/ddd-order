package com.cxytiandi.ddd.order.infrastructure.external.goods;

import com.cxytiandi.ddd.order.domain.goods.external.SkuExternalService;
import com.cxytiandi.ddd.order.domain.goods.valueobject.Sku;
import com.cxytiandi.ddd.order.infrastructure.adapter.goods.SkuAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkuExternalServiceImpl implements SkuExternalService {

    @Autowired
    private SkuAdapter skuAdapter;

    @Override
    public List<Sku> batchQuerySkus(List<Long> skuIds) {
        return skuAdapter.batchQuerySkus(skuIds);
    }
}
