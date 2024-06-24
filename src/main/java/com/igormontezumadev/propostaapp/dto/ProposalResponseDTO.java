package com.igormontezumadev.propostaapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProposalResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String cpf;
    private Double income;
    private Double requestedAmount;
    private int paymentDeadline;
    private Boolean approved;
    private String observation;
}
