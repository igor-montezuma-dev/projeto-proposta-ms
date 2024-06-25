package com.igormontezumadev.propostaapp.controller;

import com.igormontezumadev.propostaapp.dto.ProposalRequestDTO;
import com.igormontezumadev.propostaapp.dto.ProposalResponseDTO;
import com.igormontezumadev.propostaapp.service.ProposalService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/proposta")
public class ProposalController {

    private ProposalService proposalService;

    @PostMapping
    public ResponseEntity<ProposalResponseDTO> createProposal(@RequestBody ProposalRequestDTO requestDto) {
        ProposalResponseDTO responseDTO =  proposalService.createProposal(requestDto);
        return ResponseEntity.ok(responseDTO);
    }
}
