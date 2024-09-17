package com.scalar.alok.oops.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle extends BaseModel {
    private String number;
    private String ownerName;
    private VehicleType vehicleType;
}
