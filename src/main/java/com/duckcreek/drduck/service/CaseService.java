package com.duckcreek.drduck.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duckcreek.drduck.model.Cases;

@Service
public interface CaseService {

	
	List<Cases> findAllCases();
}
