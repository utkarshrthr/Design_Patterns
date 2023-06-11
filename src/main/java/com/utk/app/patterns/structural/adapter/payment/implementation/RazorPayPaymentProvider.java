package com.utk.app.patterns.structural.adapter.payment.implementation;

import com.utk.app.patterns.structural.adapter.payment.external_apis.RazorPayApi;
import com.utk.app.patterns.structural.adapter.payment.internal_apis.PaymentProvider;
import com.utk.app.patterns.structural.adapter.payment.internal_apis.PaymentRequest;
import com.utk.app.patterns.structural.adapter.payment.internal_apis.PaymentStatus;

public class RazorPayPaymentProvider implements PaymentProvider {

    private final RazorPayApi api = new RazorPayApi();

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
        return null;
    }
}
