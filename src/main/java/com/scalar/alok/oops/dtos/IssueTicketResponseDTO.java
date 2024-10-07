package com.scalar.alok.oops.dtos;

import com.scalar.alok.oops.model.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketResponseDTO {
    private Ticket ticket;
    private ResponseStatus status;
}
