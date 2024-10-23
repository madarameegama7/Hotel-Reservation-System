package Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Model.user;
import Services.userServices;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public registerServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		user userModel = new user();
		
		userModel.setFullName(request.getParameter("name"));
		userModel.setUserEmail(request.getParameter("email"));
		userModel.setUserName(request.getParameter("username"));
		userModel.setPassword(request.getParameter("password"));
		userModel.setContactNumber(request.getParameter("contactnumber"));
		userModel.setAddress(request.getParameter("address"));
		
		userServices service = new userServices();
		
		service.insertData(userModel);
		
		RequestDispatcher dis = request.getRequestDispatcher("Main.jsp");
		
		dis.forward(request, response);
	}

}
