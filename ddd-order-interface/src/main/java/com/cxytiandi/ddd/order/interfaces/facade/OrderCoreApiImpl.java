package com.cxytiandi.ddd.order.interfaces.facade;

import com.alibaba.cola.dto.SingleResponse;
import com.cxytiandi.ddd.order.api.OrderCoreApi;
import com.cxytiandi.ddd.order.api.request.PlaceOrderRequest;
import com.cxytiandi.ddd.order.api.response.PlaceOrderResponse;
import com.cxytiandi.ddd.order.application.dto.PlaceOrderDto;
import com.cxytiandi.ddd.order.application.service.OrderCoreApplicationService;
import com.cxytiandi.ddd.order.interfaces.assembler.OrderCoreAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * 订单核心接口实现
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 13:31
 */
@RestController
public class OrderCoreApiImpl implements OrderCoreApi {

    @Autowired
    private OrderCoreApplicationService orderCoreApplicationService;

    @PostMapping("/placeOrder")
    @Override
    public SingleResponse<PlaceOrderResponse> placeOrder(@RequestBody PlaceOrderRequest request) {
        PlaceOrderDto placeOrderDto = orderCoreApplicationService.placeOrder(OrderCoreAssembler.INSTANCE.toPlaceOrderCommand(request));
        if (Objects.isNull(placeOrderDto)) {
            return SingleResponse.buildFailure("", "");
        }
        return SingleResponse.of(OrderCoreAssembler.INSTANCE.toPlaceOrderResponse(placeOrderDto));
    }

}
