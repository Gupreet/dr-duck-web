package com.duckcreek.drduck.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.duckcreek.drduck.model.Cases;

@Repository
public class CasesRepositoryImpl implements CasesRepository {

	private static List<Cases> casesList = new ArrayList<>();
	static {
		casesList.add(new Cases("subject","this is resolution dummy text for cases this is resolution dummy text for cases this is resolution dummy text for cases"));
		casesList.add(new Cases("subject1","this is resolution dummy text for cases this is resolution dummy text for cases this is resolution dummy text for cases"));
		casesList.add(new Cases("subject2","this is resolution dummy text for cases this is resolution dummy text for cases this is resolution dummy text for cases"));
		casesList.add(new Cases("subject3","this is resolution dummy text for cases this is resolution dummy text for cases this is resolution dummy text for cases"));
		casesList.add(new Cases("subject4","this is resolution dummy text for cases this is resolution dummy text for cases this is resolution dummy text for cases"));
		
	}
	@Override
	public List<Cases> findAllCases() {
		return casesList;
	}

}
