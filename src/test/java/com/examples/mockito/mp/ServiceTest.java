/*
 *  Copyright (c) 2019, Oracle And/or its affiliates. All rights reserved.
 *
 *
 */
package com.examples.mockito.mp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.examples.mockito.mp.model.Payment;
import com.examples.mockito.mp.repository.PaymentRepository;
import com.examples.mockito.mp.service.PaymentService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServiceTest{

    @InjectMocks
    private PaymentService testCase;

    @Mock
    private PaymentRepository paymentRepository;

	@Test
    void testPaymentServiceGetAll() {
        List<Payment> objectList  = new ArrayList<Payment>();
		objectList.add(new Payment(1l,"merchant1", "external1", 100.00));
        objectList.add(new Payment(2l,"merchant2", "external2", 200.00));
        
        Mockito.when(paymentRepository.findAll()).thenReturn(objectList);
		List<Payment> testResult = testCase.getPendingPayments();
		assertTrue(testResult.size() > 0);
    } 
}
