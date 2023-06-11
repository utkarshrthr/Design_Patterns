package com.utk.app.patterns.structural.adapter.payment.external_apis;

public final class PayPalPaymentRequest {

    private int amount;
    private String emailId;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public PayPalPaymentRequest(int amount, String emailId) {
        this.amount = amount;
        this.emailId = emailId;
    }

    public PayPalPaymentRequest(){

    }
}
