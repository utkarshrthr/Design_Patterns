package com.utk.app.patterns.structural.adapter.payment.implementation;

import com.utk.app.patterns.structural.adapter.payment.external_apis.PayPalApi;
import com.utk.app.patterns.structural.adapter.payment.external_apis.PayPalPaymentStatus;
import com.utk.app.patterns.structural.adapter.payment.internal_apis.PaymentProvider;
import com.utk.app.patterns.structural.adapter.payment.internal_apis.PaymentRequest;
import com.utk.app.patterns.structural.adapter.payment.internal_apis.PaymentStatus;

public class PayPalPaymentProvider implements PaymentProvider {

    private final PayPalApi api = new PayPalApi();

    @Override
    public String link() {

        return null;
    }

    @Override
    public String pay(PaymentRequest request) {

        return null;
    }

    @Override
    public PaymentStatus checkStatus(String transactionId) {
        PayPalPaymentStatus status = api.checkStatus(transactionId);

        if(status == PayPalPaymentStatus.ERROR)
            return PaymentStatus.FAILURE;

        if(status == PayPalPaymentStatus.IN_PROGRESS)
            return PaymentStatus.INITIATED;

        return PaymentStatus.OK;
    }
}
