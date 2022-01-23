package com.cxytiandi.ddd.order.infrastructure.external.buyer;

import com.cxytiandi.ddd.order.domain.buyer.external.BuyerExternalService;
import com.cxytiandi.ddd.order.domain.buyer.valueobject.Buyer;
import com.cxytiandi.ddd.order.infrastructure.adapter.buyer.BuyerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerExternalServiceImpl implements BuyerExternalService {

    @Autowired
    private BuyerAdapter buyerAdapter;

    @Override
    public Buyer getBuyer(Long buyerId) {
        return buyerAdapter.getBuyer(buyerId);
    }

}
