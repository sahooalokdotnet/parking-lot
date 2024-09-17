package com.scalar.alok.oops.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment extends BaseModel{
    private int amount;
    private Date time;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private String referenceNumber;
}
