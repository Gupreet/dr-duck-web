package com.duckcreek.drduck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.duckcreek.drduck.service.CaseService;

@Controller
public class CasesController {

	
	@Autowired
	private CaseService caseService;
	
	@RequestMapping("/")
    public String index(final Model model) {
			
		
        model.addAttribute("cases",caseService.findAllCases() );
		
        return "index";
	}
}
