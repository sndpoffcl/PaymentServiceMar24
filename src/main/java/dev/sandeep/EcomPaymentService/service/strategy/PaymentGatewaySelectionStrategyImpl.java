package dev.sandeep.EcomPaymentService.service.strategy;

import org.springframework.stereotype.Service;

@Service
public class PaymentGatewaySelectionStrategyImpl implements PaymentGatewaySelectionStrategy{
    @Override
    public int paymentGatewaySelection() {
        return 0;
    }
}
