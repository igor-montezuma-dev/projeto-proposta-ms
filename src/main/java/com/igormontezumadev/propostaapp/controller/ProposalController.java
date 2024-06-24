package com.igormontezumadev.propostaapp.controller;

import com.igormontezumadev.propostaapp.dto.ProposalRequestDTO;
import com.igormontezumadev.propostaapp.dto.ProposalResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proposta")
public class ProposalController {

    @PostMapping
    public ResponseEntity<ProposalResponseDTO> createProposal(@RequestBody ProposalRequestDTO requestDto) {
        return null;
    }
}
