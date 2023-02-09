package com.taylorw5.service;

import org.springframework.stereotype.Component;

import com.taylorw5.dto.SpecimenDTO;

@Component
public class SpecimenSeviceStub implements ISpecimenService {
	@Override
	public SpecimenDTO fetchByID(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenID(43);
		specimenDTO.setLatitude("39.74");
		specimenDTO.setLongitude("-84.51");
		specimenDTO.setDescription("a beautiful eastern redbud");
		return specimenDTO;
	}
	
	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}
}
