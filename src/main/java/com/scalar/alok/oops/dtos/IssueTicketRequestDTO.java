package com.scalar.alok.oops.dtos;

import com.scalar.alok.oops.model.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketRequestDTO {
    private String vehicleNumber;
    private String vehicleOwnerName;
    private long gateId;
    private VehicleType vehicleType;
}
