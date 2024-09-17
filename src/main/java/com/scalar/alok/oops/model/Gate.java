package com.scalar.alok.oops.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel {
    private int gateNumber;
    private GateStatus gateStatus;
    private GateType gateType;
    private Operator operator;
}
