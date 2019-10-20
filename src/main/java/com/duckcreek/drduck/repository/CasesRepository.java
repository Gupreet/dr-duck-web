package com.duckcreek.drduck.repository;


import java.util.List;

import com.duckcreek.drduck.model.Cases;


public interface CasesRepository {

	List<Cases> findAllCases();
}
