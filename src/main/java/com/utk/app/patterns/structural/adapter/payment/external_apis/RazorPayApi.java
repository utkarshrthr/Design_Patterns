package com.utk.app.patterns.structural.adapter.payment.external_apis;

public final class RazorPayApi {

    public String generatePaymentLink(){
        return "This link will redirect to payment page";
    }

    public String makePayment(int amount, String emailId){
        return "Payment Initiated";
    }

    public RazorPayPaymentStatus checkStatus(String transactionId){
        return RazorPayPaymentStatus.SUCCESS;
    }
}
