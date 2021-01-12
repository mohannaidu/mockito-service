/*
 *  Copyright (c) 2019, Oracle And/or its affiliates. All rights reserved.
 *
 *
 */
package com.examples.mockito.mp.service;

import java.util.List;

import javax.inject.Inject;
import com.examples.mockito.mp.model.Payment;
import com.examples.mockito.mp.repository.PaymentRepository;

public class PaymentService {
    
    @Inject
    private PaymentRepository paymentRepository;

    public List<Payment> getPendingPayments(){
        return paymentRepository.findAll();
    }
}
