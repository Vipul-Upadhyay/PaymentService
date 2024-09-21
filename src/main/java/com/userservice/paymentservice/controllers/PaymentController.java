package com.userservice.paymentservice.controllers;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import com.userservice.paymentservice.dtos.InitiatePaymentRequestDto;
import com.userservice.paymentservice.services.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto requestDto) throws RazorpayException, StripeException {
        return paymentService.initiatePayment(requestDto.getOrderId(), requestDto.getAmount(), requestDto.getPhoneNumber(), requestDto.getEmail());
    }
}
