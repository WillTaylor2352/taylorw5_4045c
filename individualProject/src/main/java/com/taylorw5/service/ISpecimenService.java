package com.taylorw5.service;

import com.taylorw5.dto.SpecimenDTO;

public interface ISpecimenService {

	SpecimenDTO fetchByID(int id);

	void save(SpecimenDTO specimenDTO);

}