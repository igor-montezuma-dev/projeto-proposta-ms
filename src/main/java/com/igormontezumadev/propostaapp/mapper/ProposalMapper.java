package com.igormontezumadev.propostaapp.mapper;

import com.igormontezumadev.propostaapp.dto.ProposalRequestDTO;
import com.igormontezumadev.propostaapp.dto.ProposalResponseDTO;
import com.igormontezumadev.propostaapp.entity.Proposal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProposalMapper {

    ProposalMapper INSTANCE = Mappers.getMapper(ProposalMapper.class);

    @Mapping(target = "user.firstName", source = "firstName")
    @Mapping(target = "user.lastName", source = "lastName")
    @Mapping(target = "user.cpf", source = "cpf")
    @Mapping(target = "user.phone", source = "phone")
    @Mapping(target = "user.income", source = "income")
    @Mapping(target="id", ignore = true)
    @Mapping(target="approved", ignore = true)
    @Mapping(target="integrated", ignore = true)
    @Mapping(target="observation", ignore = true)
    Proposal convertDTOToProposal(ProposalRequestDTO requestDto);

    @Mapping(target = "firstName", source = "user.firstName")
    @Mapping(target = "lastName", source = "user.lastName")
    @Mapping(target = "cpf", source = "user.cpf")
    @Mapping(target = "phone", source = "user.phone")
    @Mapping(target = "income", source = "user.income")

    ProposalResponseDTO convertEntityToDTO(Proposal proposal);
}
