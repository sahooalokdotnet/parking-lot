package com.scalar.alok.oops.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket extends BaseModel{
    private String ticketNumber;
    private Date entryTime;
    private Vehicle vehicle;
    private Gate gate;
    private Operator generatedBy;
    private ParkingSpot parkingSpot;
}
