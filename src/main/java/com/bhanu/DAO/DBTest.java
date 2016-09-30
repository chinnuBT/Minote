package com.bhanu.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DBTest {
	Connection con;
	
	@Autowired
	DataSource ds;
	
	public DBTest() {
		// TODO Auto-generated constructor stub
		System.out.println("Initializing DBHandle...");
	}
	
	public DataSource getDataSource(){
		return ds;
	}
	
	@PostConstruct
	void testDbConnection(){
		
	try{
		System.out.println("Successful...");
		
		/*
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/bhanuOracle");
		*/
		Connection conn = ds.getConnection();
		Statement stmt = conn.createStatement();  
		ResultSet rs = stmt.executeQuery("select employee_id from temporary");
		
		while(rs.next()){
		System.out.println(rs.getInt(1));
		}
		System.out.println("Successfully quried DB..");
		/*
		 * System.out.println("Hello World...");
		 
		//Step1 to load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step2 create  the connection object 
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bhanu","bhanu");
		
		Statement stmt = con.createStatement();  
		
		System.out.println(con.isClosed());
		
		ResultSet rs = stmt.executeQuery("select employee_id from temporary");
		
		while(rs.next()){
		System.out.println(rs.getInt(1));
		}
		*/
	}catch(Exception e){
		//con.close();
		e.printStackTrace();
		
	}finally {
		
	}
	
	}

	/*public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}
*/

}