package com.cxytiandi.ddd.order.infrastructure.external.risk;

import com.cxytiandi.ddd.order.domain.risk.external.RiskExternalService;
import com.cxytiandi.ddd.order.domain.risk.valueobject.RiskCheckRequest;
import com.cxytiandi.ddd.order.domain.risk.valueobject.RiskCheckResponse;
import com.cxytiandi.ddd.order.infrastructure.adapter.risk.RiskAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiskExternalServiceImpl implements RiskExternalService {

    @Autowired
    private RiskAdapter riskAdapter;

    @Override
    public RiskCheckResponse riskCheck(RiskCheckRequest request) {
        return riskAdapter.riskCheck(request);
    }
}
