package com.cxytiandi.ddd.order.interfaces.assembler;

import com.cxytiandi.ddd.order.api.request.PlaceOrderRequest;
import com.cxytiandi.ddd.order.api.response.PlaceOrderResponse;
import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import com.cxytiandi.ddd.order.application.dto.PlaceOrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * DTO转换
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 13:51
 */
@Mapper(componentModel = "spring")
public interface OrderCoreAssembler {

    OrderCoreAssembler INSTANCE = Mappers.getMapper(OrderCoreAssembler.class);

    PlaceOrderCommand toPlaceOrderCommand(PlaceOrderRequest request);

    PlaceOrderResponse toPlaceOrderResponse(PlaceOrderDto dto);
}
