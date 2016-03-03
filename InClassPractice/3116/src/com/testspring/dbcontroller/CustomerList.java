package com.testspring.dbcontroller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerList {
@RequestMapping("/welcome4")
public ModelAndView listData(){
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c;
		String connectionStr = "jdbc:mysql://localhost:3306/northwind";
		c= DriverManager.getConnection(connectionStr,"root","root");
		Statement s =c.createStatement();
		ResultSet results = s.executeQuery("SELECT * from customers");
		ArrayList <String> customerID = new ArrayList<>();
		while (results.next()){
			customerID.add(results.getString(1));
		}
		return new ModelAndView("welcome4","clist",customerID);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return new ModelAndView("error","message",e.getMessage());
	}
	
}
}
