package com.in28minutes.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessClacService {
	private DataService dataService;
	
	public BusinessClacService(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
	
}
