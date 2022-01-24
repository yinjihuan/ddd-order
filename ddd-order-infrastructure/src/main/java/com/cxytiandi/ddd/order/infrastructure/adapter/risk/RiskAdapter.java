package com.cxytiandi.ddd.order.infrastructure.adapter.risk;

import com.cxytiandi.ddd.order.domain.risk.valueobject.RiskCheckRequest;
import com.cxytiandi.ddd.order.domain.risk.valueobject.RiskCheckResponse;
import org.springframework.stereotype.Component;

/**
 * 风控适配
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-24 22:48
 */
@Component
public class RiskAdapter {

    public RiskCheckResponse riskCheck(RiskCheckRequest request) {
        // 调用风控提供的接口，进行防腐处理
        // mock data
        RiskCheckResponse checkResponse = new RiskCheckResponse();
        checkResponse.setResult(true);
        checkResponse.setMessage("校验通过");
        return checkResponse;
    }
}
