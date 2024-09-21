package com.userservice.paymentservice.controllers;

import jdk.jfr.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {

    public void stripeWebhook(Event event){
        System.out.println("Stripe Webhook endpoint");
    }
}
