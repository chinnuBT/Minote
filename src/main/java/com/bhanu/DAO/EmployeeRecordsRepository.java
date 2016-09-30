package com.bhanu.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRecordsRepository extends MinoteJDBCTemplate{
	
	public int  getEmployeeCount(){
		int count =0;
		try{
			
			count = this.getJdbcTemplate().queryForObject("select count(*) from temporary", Integer.class);
			
		}catch(Exception e){
			System.out.println("Error while performing db operation..");
			e.printStackTrace();
		}
		return count;
		
	}

}
