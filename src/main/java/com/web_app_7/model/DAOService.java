package com.web_app_7.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
	public boolean verifyLogin(String email,String password);
	public void saveRegistration(String name,String city,String number,String email);
	public void delete(String email);
	public void update(String email,String number);
	public ResultSet listReg();
	public void closeDB();
}
