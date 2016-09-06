package com.bhanu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.LoggerFactory;

@Controller
public class MinoteBaseController {
	
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(MinoteBaseController.class);
	
	@RequestMapping(value="/gg")
	public String welcomeToMintoe(){
		logger.debug("Hello...");
		return "Welcome";
	}

}
