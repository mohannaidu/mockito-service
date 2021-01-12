/*
 *  Copyright (c) 2019, Oracle And/or its affiliates. All rights reserved.
 *
 *
 */
package com.examples.mockito.mp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
    
    @Id
    private long id;

    private String merchantId;

    private String externalReferenceNo;

    private Double amount;

    public Payment(long id, String merchantId, String externalReferenceNo, Double amount) {
        this.id = id;
        this.merchantId = merchantId;
        this.externalReferenceNo = externalReferenceNo;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getExternalReferenceNo() {
        return externalReferenceNo;
    }

    public void setExternalReferenceNo(String externalReferenceNo) {
        this.externalReferenceNo = externalReferenceNo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
