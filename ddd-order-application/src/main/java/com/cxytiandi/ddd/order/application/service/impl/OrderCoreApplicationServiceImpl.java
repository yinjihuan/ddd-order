package com.cxytiandi.ddd.order.application.service.impl;

import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import com.cxytiandi.ddd.order.application.dto.PlaceOrderDto;
import com.cxytiandi.ddd.order.application.service.OrderCoreApplicationService;
import org.springframework.stereotype.Service;

@Service
public class OrderCoreApplicationServiceImpl implements OrderCoreApplicationService {

    @Override
    public PlaceOrderDto placeOrder(PlaceOrderCommand command) {
        return null;
    }

}
