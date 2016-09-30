package com.bhanu.DAO;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class MinoteJDBCTemplate {
	
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParamJdbcTemplate;
	@Autowired
	private DataSource dataSource;
	
	
	JdbcTemplate getJdbcTemplate(){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
	
	NamedParameterJdbcTemplate getNamedParamJdbcTemplate(){
		this.namedParamJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		return namedParamJdbcTemplate;
	}
	
	
}
