package com.cxytiandi.ddd.order.application.command;

import com.cxytiandi.ddd.order.exception.ValidationException;
import com.cxytiandi.ddd.order.types.AddressId;
import com.cxytiandi.ddd.order.types.UserId;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

/**
 * 下单命令
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 14:00
 */
@Data
public class PlaceOrderCommand {

    /**
     * 用户
     */
    private UserId userId;

    /**
     * 地址
     */
    private AddressId addressId;

    /**
     * 下单的商品
     */
    private List<PlaceOrderSku> skus;

    /**
     * 总金额，确认订单页看到的金额
     */
    private Long totalAmount;

    @Data
    public static class PlaceOrderSku {

        /**
         * SKU
         */
        private Long skuId;

        /**
         * 购买数量
         */
        private Integer quantity;

    }

    public void check() {
        if (Objects.isNull(userId)) {
            throw new ValidationException("下单用户不能为空");
        }
        if (CollectionUtils.isEmpty(skus)) {
            throw new ValidationException("下单商品不能为空");
        }
        if (Objects.isNull(totalAmount)) {
            throw new ValidationException("下单金额不能为空");
        }
    }
}
