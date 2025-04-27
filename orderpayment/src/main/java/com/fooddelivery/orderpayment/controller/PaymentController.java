package com.fooddelivery.orderpayment.controller;

import com.fooddelivery.orderpayment.model.Payment;
import com.fooddelivery.orderpayment.repository.PaymentRepository;
import com.fooddelivery.orderpayment.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }

    @PostMapping
    public Payment savePayment(@RequestBody Payment payment) {
        return paymentService.savePaymentDirect(payment);
    }


}
