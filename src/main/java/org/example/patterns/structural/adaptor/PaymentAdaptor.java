package org.example.patterns.structural.adaptor;

import org.example.patterns.structural.adaptor.utils.Card;

public class PaymentAdaptor implements ModernPayment {

    LegacyPaymentService legacyPaymentService;
    String paymentType;
    public PaymentAdaptor(LegacyPaymentService legacyPaymentService, String paymentType){
        this.legacyPaymentService = legacyPaymentService;
        this.paymentType = paymentType;
    }


    @Override
    public void pay(Card card, String amount) {

        legacyPaymentService.processPayment(card.cardNumber, card.bankName,card.cardOwner, amount);

        System.out.println("__________________________________");
        System.out.println("Payment Type is >> " + paymentType);
        System.out.println("__________________________________");

    }
}
