package com.igormontezumadev.propostaapp.service;

import com.igormontezumadev.propostaapp.dto.ProposalRequestDTO;
import com.igormontezumadev.propostaapp.dto.ProposalResponseDTO;
import com.igormontezumadev.propostaapp.entity.Proposal;
import com.igormontezumadev.propostaapp.mapper.ProposalMapper;
import com.igormontezumadev.propostaapp.repository.ProposalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProposalService {

    private ProposalRepository proposalRepository;

    public ProposalResponseDTO createProposal( ProposalRequestDTO requestDto) {
        Proposal propposal = ProposalMapper.INSTANCE.convertDTOToProposal(requestDto);
        proposalRepository.save(propposal);
        return ProposalMapper.INSTANCE.convertEntityToDTO(propposal);
    }
}
