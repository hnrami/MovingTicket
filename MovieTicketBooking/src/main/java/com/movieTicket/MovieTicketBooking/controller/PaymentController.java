
package com.movieTicket.MovieTicketBooking.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieTicket.MovieTicketBooking.Request.PaymentRequest;
import com.movieTicket.MovieTicketBooking.entity.Payment;
import com.movieTicket.MovieTicketBooking.service.PaymentService;

@RestController
public class PaymentController {

	
	@Autowired
    private PaymentService service;

    @PostMapping("/addPayment")
    public Payment addPayment(@RequestBody PaymentRequest paymentRequest) {
        return service.savePayment(paymentRequest);
    }

    @PostMapping("/addPayments")
    public List<Payment> addPayments(@RequestBody List<Payment> payments) {
        return service.savePayments(payments);
    }

    @GetMapping("/payments")
    public List<Payment> findAllPayments() {
        return service.getPayments();
    }

    @GetMapping("/PaymentById/{id}")
    public Payment findPaymentById(@PathVariable int id) {
        return service.getPaymentById(id);
    }

    @GetMapping("/Payment/{paymentMethod}")
    public Payment findPaymentByPaymentMethod(@PathVariable String paymentMethod) {
        return service.getPaymentByPaymentMethod(paymentMethod);
    }

    @PutMapping("/payments/update")
    public Payment updatePayment(@RequestBody PaymentRequest paymentRequest) {
        return service.updatePayment(paymentRequest);
    }

    @DeleteMapping("/payments/delete/{id}")
    public String deletePayment(@PathVariable int id) {
        return service.deletePayment(id);
    }
}
