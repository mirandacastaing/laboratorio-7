package com.cenfotec.mongoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.mongoapi.domain.Professional;
import com.cenfotec.mongoapi.repository.ProfessionalRepository;

@Service
public class ProfessionalServiceImpl implements ProfessionalService {
	@Autowired
	ProfessionalRepository professionalRepo;

	@Override
	public void saveProfessional(Professional newProfessional) {
		professionalRepo.save(newProfessional);
	}
}
