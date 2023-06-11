package com.utk.app.patterns.structural.adapter.payment.internal_apis;

public interface PaymentProvider {

    String link();
    String pay(PaymentRequest request);
    PaymentStatus checkStatus(String transactionId);
}
