package com.cxytiandi.ddd.order.types;

import com.cxytiandi.ddd.order.exception.ValidationException;
import java.util.Objects;

/**
 * 地址ID
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-24 23:04
 */
public class AddressId {

    private Long value;

    public AddressId() {

    }

    public AddressId(Long addressId) {
        validation(addressId);
        this.value = addressId;
    }

    public void setValue(Long addressId) {
        validation(addressId);
        this.value = addressId;
    }

    public Long getValue() {
        return value;
    }

    private void validation(Long addressId) {
        if (Objects.isNull(addressId)) {
            throw new ValidationException("addressId不能为空");
        }
        if (addressId < 1) {
            throw new ValidationException("addressId格式错误");
        }
    }
}
