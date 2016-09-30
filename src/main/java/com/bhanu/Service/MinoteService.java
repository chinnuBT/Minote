package com.bhanu.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhanu.DAO.EmployeeRecordsRepository;

@Service
public class MinoteService {

	
	@Autowired
	private EmployeeRecordsRepository employeeRecordsRepository;
	
	public int getEmpployeeCount(){
		return employeeRecordsRepository.getEmployeeCount();
	}
	
}
