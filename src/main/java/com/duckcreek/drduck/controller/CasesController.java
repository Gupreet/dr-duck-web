package com.duckcreek.drduck.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.duckcreek.drduck.model.CaseDTO;
import com.duckcreek.drduck.util.CaseUtil;


@Controller
public class CasesController {

	
	   @Autowired
	   private RestTemplateBuilder restTemplateBuilder;
	   
	   @Value("${cases.ws.rest.url}")
		String wsurl;
		
	   
	@RequestMapping("/")
    public String index(final Model model) {
			
		
		long longOffset = 0;
		int intLimit = 100;
		String q ="process";
		

		String uri = "";
		if(wsurl != null)
			uri = wsurl;
		else 
			uri="http://localhost:8080/dr-duck-api";
				
        
		HttpHeaders headers = CaseUtil.getHeaders(MediaType.APPLICATION_JSON); 
		
		 RestTemplate restTemplate = new RestTemplate();
	        
		 HttpEntity<String> request = new HttpEntity<String>(headers);
		  ResponseEntity<List<CaseDTO>> response = restTemplate.exchange(uri, HttpMethod.GET, request, new ParameterizedTypeReference<List<CaseDTO>>() {
	        });
		
		 System.out.println("Status Code :"+response.getStatusCode().toString()+"-------------result :"+ response.getBody().toString());
		   List<CaseDTO> casesList=   response.getBody();
		   model.addAttribute("cases", casesList);
		
		
        System.out.println("Status Code1 :"+response.getStatusCode().toString()+"-------------result :"+casesList );
        return "index";
        
       
	}
	
}
