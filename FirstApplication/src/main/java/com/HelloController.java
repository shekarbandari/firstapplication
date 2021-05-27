package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@Autowired
	Project project;
	
	@Value("${company.location}")
	private String companyLocation;
	
	@RequestMapping("/project")
	public String getProjectDetails() {
		return "project name is :::"+project.getName()+"project location::"+project.getLocation()+"company location::"+companyLocation;
	}
}
