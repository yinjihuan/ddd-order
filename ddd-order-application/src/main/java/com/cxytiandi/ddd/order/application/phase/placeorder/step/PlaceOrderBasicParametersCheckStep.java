package com.cxytiandi.ddd.order.application.phase.placeorder.step;

import com.cxytiandi.ddd.order.application.command.PlaceOrderCommand;
import com.cxytiandi.ddd.order.exception.ValidationException;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 下单基础参数校验
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 16:36
 */
@Component
public class PlaceOrderBasicParametersCheckStep {

    public void checkBasicParameters(PlaceOrderCommand command) {
        if (Objects.isNull(command)) {
            throw new ValidationException("下单command对象不能为空");
        }
        command.check();
    }

}
