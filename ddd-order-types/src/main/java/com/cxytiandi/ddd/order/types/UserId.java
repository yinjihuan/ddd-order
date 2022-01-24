package com.cxytiandi.ddd.order.types;

import com.cxytiandi.ddd.order.exception.ValidationException;
import java.util.Objects;

/**
 * 用户ID
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-23 16:15
 */
public class UserId {

    private Long value;

    public UserId() {

    }

    public UserId(Long userId) {
        validation(userId);
        this.value = userId;
    }

    public void setValue(Long userId) {
        validation(userId);
        this.value = userId;
    }

    public Long getValue() {
        return value;
    }

    private void validation(Long userId) {
        if (Objects.isNull(userId)) {
            throw new ValidationException("userId不能为空");
        }
        if (userId < 1) {
            throw new ValidationException("userId格式错误");
        }
    }
}
