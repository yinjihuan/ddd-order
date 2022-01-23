package com.cxytiandi.ddd.order.application.service.impl;

import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import com.cxytiandi.ddd.order.application.context.PlaceOrderContext;
import com.cxytiandi.ddd.order.application.dto.PlaceOrderDto;
import com.cxytiandi.ddd.order.application.phase.placeorder.PlaceOrderContextInitPhase;
import com.cxytiandi.ddd.order.application.phase.placeorder.PlaceOrderPreCheckPhase;
import com.cxytiandi.ddd.order.application.phase.placeorder.PlaceOrderProcessPhase;
import com.cxytiandi.ddd.order.application.service.OrderCoreApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCoreApplicationServiceImpl implements OrderCoreApplicationService {

    @Autowired
    private PlaceOrderContextInitPhase placeOrderContextInitPhase;

    @Autowired
    private PlaceOrderPreCheckPhase placeOrderPreCheckPhase;

    @Autowired
    private PlaceOrderProcessPhase placeOrderProcessPhase;

    @Override
    public PlaceOrderDto placeOrder(PlaceOrderCommand command) {
        // 初始化阶段
        PlaceOrderContext context = placeOrderContextInitPhase.init(command);

        // 校验阶段
        placeOrderPreCheckPhase.check(context);

        // 执行阶段
        placeOrderProcessPhase.process(context);

        return null;
    }

}
