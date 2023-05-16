package com.web_app_7.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	private Connection con;
	private Statement stmnt;
	
	@Override
	public void connectDB() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginappdb","root","test0006");
		 stmnt = con.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			 ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
				return result.next();
				
				} catch (Exception e) {
				}
				
				
				
				
				return false;
	}

	@Override
	public void saveRegistration(String name, String city, String number, String email) {
		try {
			stmnt.executeUpdate("insert into dett values('"+name+"','"+city+"','"+number+"','"+email+"')");
		
		} catch (Exception e) {
		}
		
	}

	@Override
	public void delete(String email) {
try {
			
			stmnt.executeUpdate("delete from dett where email='"+email+"'");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void update(String email, String number) {
try {
			
			stmnt.executeUpdate("update dett set email='"+email+"' where number='"+number+"'");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public ResultSet listReg() {
		try {
			ResultSet result = stmnt.executeQuery("select * from dett");
			return result;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public void closeDB() {
		// TODO Auto-generated method stub
		
	}

}
