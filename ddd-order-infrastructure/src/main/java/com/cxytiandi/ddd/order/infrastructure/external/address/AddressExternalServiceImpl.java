package com.cxytiandi.ddd.order.infrastructure.external.address;

import com.cxytiandi.ddd.order.domain.address.external.AddressExternalService;
import com.cxytiandi.ddd.order.domain.address.valueobject.Address;
import com.cxytiandi.ddd.order.infrastructure.adapter.address.AddressAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressExternalServiceImpl implements AddressExternalService {

    @Autowired
    private AddressAdapter addressAdapter;

    @Override
    public Address getAddress(Long userId, Long addressId) {
        return addressAdapter.getAddress(userId, addressId);
    }
}
