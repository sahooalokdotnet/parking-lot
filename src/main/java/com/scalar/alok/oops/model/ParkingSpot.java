package com.scalar.alok.oops.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ParkingSpot {
    private List<VehicleType> vehicleTypes;
    private int parkingSpotNumber;
    private ParkingLotStatus parkingLotStatus;
}
