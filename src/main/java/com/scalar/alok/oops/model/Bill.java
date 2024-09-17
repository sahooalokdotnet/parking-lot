package com.scalar.alok.oops.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Bill  extends BaseModel {
    private Ticket ticket;
    private int amount;
    private Date exitTime;
    private Operator generatedBy;
    private Gate gate;
    private BillStatus status;
    private List<Payment> paymentList;
    private FeeCalculationStartegyType feeCalculationStartegyType;

}
