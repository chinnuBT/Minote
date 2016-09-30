package com.bhanu.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bhanu.Service.MinoteService;

@Controller
public class MinoteBaseController {
	
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(MinoteBaseController.class);
	

	@Autowired
	MinoteService minoteService;
	
	public MinoteBaseController() {
		System.out.println("MinoteBase Ctrol...");
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/empCount", method = RequestMethod.GET)
	public String getUserCount(ModelMap model){
		
		logger.debug("Hello...");
		int empCount = minoteService.getEmpployeeCount();
		System.out.println("Employee Count --" + empCount);
		model.addAttribute("empCount", empCount);
		
		return "Welcome";
	}
	/*
	@RequestMapping(value="/empDetails", method = RequestMethod.GET)
	public String getUserDetails(ModelMap model){
		
		logger.debug("Hello...");
		int empCount = minoteService.getEmpployeeCount();
		System.out.println("Employee Count --" + empCount);
		model.addAttribute("empCount", empCount)
		
		return "Welcome";
	}
	*/

}
