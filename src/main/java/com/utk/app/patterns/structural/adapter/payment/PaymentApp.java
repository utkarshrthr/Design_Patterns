package com.utk.app.patterns.structural.adapter.payment;

import com.utk.app.patterns.structural.adapter.payment.implementation.PayPalPaymentProvider;
import com.utk.app.patterns.structural.adapter.payment.implementation.PaymentMethod;
import com.utk.app.patterns.structural.adapter.payment.implementation.RazorPayPaymentProvider;
import com.utk.app.patterns.structural.adapter.payment.internal_apis.PaymentProvider;
import com.utk.app.patterns.structural.adapter.payment.internal_apis.PaymentRequest;

public class PaymentApp {

    private PaymentProvider provider;

    public void pay(PaymentMethod paymentMethod, PaymentRequest paymentRequest){

        provider = getPaymentProvider(paymentMethod);

        String paymentLink = provider.link();
        String transactionId = provider.pay(paymentRequest);
    }

    private PaymentProvider getPaymentProvider(PaymentMethod paymentMethod){
        if(paymentMethod == PaymentMethod.PAY_PAL){
            return provider = new PayPalPaymentProvider();
        }
        if(paymentMethod == PaymentMethod.RAZOR_PAY){
            return provider = new RazorPayPaymentProvider();
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
