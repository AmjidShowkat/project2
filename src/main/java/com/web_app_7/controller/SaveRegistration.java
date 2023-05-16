package com.web_app_7.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web_app_7.model.DAOService;
import com.web_app_7.model.DAOServiceImpl;



@WebServlet("/saveReg")
public class SaveRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SaveRegistration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(10);
		if(session.getAttribute("email")!=null) {
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String number = request.getParameter("number");
		String email = request.getParameter("email");
		
		DAOService ser = new DAOServiceImpl();
		ser.connectDB();
		ser.saveRegistration(name, city, number, email);
		request.setAttribute("md", "Details Saved Sussefully Hyati");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/createRegistration.jsp");
		rd.forward(request, response);}
		else {
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}catch(Exception e){
		request.setAttribute("ml", "Time Out");
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
		
		
	}

}
