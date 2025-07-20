package org.example.patterns.structural.adaptor.utils;

import org.example.patterns.structural.adaptor.LegacyPaymentService;
import org.example.patterns.structural.adaptor.ModernPayment;
import org.example.patterns.structural.adaptor.PaymentAdaptor;

public class Main {
    public static void main(String[] args) {
        LegacyPaymentService legacyPaymentService = new LegacyPaymentService();

        ModernPayment paymentAdaptor = new PaymentAdaptor(legacyPaymentService,"Modern");

        Card card = new Card();
        card.setCardNumber("dfdf");
        card.setBankName("dfdf");
        card.setCardOwner("dfdf");
        paymentAdaptor.pay(card,"100");

    }
}
