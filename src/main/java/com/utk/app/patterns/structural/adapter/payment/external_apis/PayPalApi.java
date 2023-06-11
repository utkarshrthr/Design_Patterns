package com.utk.app.patterns.structural.adapter.payment.external_apis;

public final class PayPalApi {

    public String generatePaymentLink(){
        return "This link will redirect to payment page";
    }

    public String initiatePayment(PayPalPaymentRequest request){
        return "Payment Initiated";
    }

    public PayPalPaymentStatus checkStatus(String transactionId){
        return PayPalPaymentStatus.IN_PROGRESS;
    }
}
