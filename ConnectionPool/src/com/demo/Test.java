package com.demo;

import java.sql.Connection;
import java.sql.SQLException;


import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test {

	public static void main(String[] args) throws SQLException {
		
	DriverManagerDataSource bds = new DriverManagerDataSource();
	
	bds.setDriverClassName("com.mysql.jdbc.Driver");
	bds.setUrl("jdbc:mysql://localhost:3306/connpool");
	bds.setUsername("root");
	bds.setPassword("dinga");
	for(int i =1;i<21;i++) {
	Connection con = bds.getConnection();
	System.out.println(con +"  "+i);
	}
	}

}
