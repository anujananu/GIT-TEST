package com.sgic.hrm.employee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.ProfessionalMembership;
import com.sgic.hrm.commons.repository.ProfessionalMembershipRepository;
import com.sgic.hrm.employee.service.ProfessionalMembershipService;

@Service
public class ProfessionalMembershipServiceImpl implements ProfessionalMembershipService {
	@Autowired
	private ProfessionalMembershipRepository professionalMembershipRepository;
	
	
	@Override
	public boolean addProfessionalMembership(ProfessionalMembership professionalMembership) {
		professionalMembershipRepository.save(professionalMembership);
		return false;
	}

	@Override
	public List<ProfessionalMembership> getAllProfessionalMembership() {
		return professionalMembershipRepository.findAll();
	}

	@Override
	public boolean editProfessionalMembership(ProfessionalMembership professionalMembership, Integer id) {
		if(professionalMembershipRepository.getOne(id)!=null) {
			professionalMembership.setId(id);
			professionalMembershipRepository.save(professionalMembership);
			return true;
		}
		return false;
	}

	@Override
	public Optional<ProfessionalMembership> getProfessionalMembershipById(int id) {
		return professionalMembershipRepository.findById(id);
	}

	@Override
	public boolean deleteProfessionalMembership(Integer id) {
		if(professionalMembershipRepository.getOne(id)!=null) {
			professionalMembershipRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
