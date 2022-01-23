package com.cxytiandi.ddd.order.types;

import com.cxytiandi.ddd.order.exception.ValidationException;
import lombok.Data;
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
@Data
public class UserId {

    private Long userId;

    public UserId() {

    }

    public UserId(Long userId) {
        validation(userId);
        this.userId = userId;
    }

    public void setUserId(Long userId) {
        validation(userId);
        this.userId = userId;
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
