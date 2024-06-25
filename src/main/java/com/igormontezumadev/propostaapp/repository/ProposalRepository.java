package com.igormontezumadev.propostaapp.repository;

import com.igormontezumadev.propostaapp.entity.Proposal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProposalRepository extends CrudRepository<Proposal, Long> {
}
