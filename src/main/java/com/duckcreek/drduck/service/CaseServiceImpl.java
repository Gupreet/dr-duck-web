package com.duckcreek.drduck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duckcreek.drduck.model.Cases;
import com.duckcreek.drduck.repository.CasesRepository;

@Service
public class CaseServiceImpl implements CaseService {

	@Autowired
	private CasesRepository casesRepository;

	
	@Override
	public List<Cases> findAllCases() {
		// TODO Auto-generated method stub
		return casesRepository.findAllCases();
	}

}
