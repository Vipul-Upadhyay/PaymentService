package com.userservice.paymentservice.services;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.userservice.paymentservice.paymentgateway.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(String orderId, Long amount, String phoneNumber, String email) throws RazorpayException, StripeException {
        return paymentGateway.generatePaymentLink(orderId, amount, phoneNumber, email);
    }
}
