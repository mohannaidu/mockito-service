/*
 *  Copyright (c) 2019, Oracle And/or its affiliates. All rights reserved.
 *
 *
 */
package com.examples.mockito.mp.repository;

import java.util.Arrays;
import java.util.List;

import com.examples.mockito.mp.model.Payment;

public class PaymentRepository {
    
    public List<Payment> findAll(){
        Payment payment1 = new Payment(1l,"merchant1", "external1", 100.00);
        Payment payment2 = new Payment(2l,"merchant2", "external2", 200.00);
        return Arrays.asList(payment1, payment2);
    }
}
