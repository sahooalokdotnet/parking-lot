package com.scalar.alok.oops.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseModel {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> vehicleTypes;
    private ParkingLotStatus parkingLotStatus;
    private ParkingSpotAssignmentStrategyType parkingSpotAssignmentStrategyType;
    private FeeCalculationStartegyType feeCalculationStartegyType;
}
