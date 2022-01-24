package com.cxytiandi.ddd.order.domain.risk.external;

import com.cxytiandi.ddd.order.domain.risk.valueobject.RiskCheckRequest;
import com.cxytiandi.ddd.order.domain.risk.valueobject.RiskCheckResponse;

/**
 * 风控外部服务
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2022-01-24 22:39
 */
public interface RiskExternalService {

    RiskCheckResponse riskCheck(RiskCheckRequest request);

}
