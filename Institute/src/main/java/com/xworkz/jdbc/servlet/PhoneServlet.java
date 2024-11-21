package com.xworkz.jdbc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jdbc.service.InstituteServiceimpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/phone")
public class PhoneServlet extends HttpServlet {
		public PhoneServlet() {
			System.out.println("no arg const in PhoneServlet");
		}
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String phoneNumber = req.getParameter("contactNumber");
				long phone_number = Long.parseLong(phoneNumber);
				if (phoneNumber != null) {
					InstituteServiceimpl registrationServiceimpl = new InstituteServiceimpl();
					String valid = registrationServiceimpl.getEMailAndPassword(phone_number);
					System.out.println(valid);
					if (valid != null) {
						req.setAttribute("success", valid);
					}
					else {
						req.setAttribute("failure", "no data found");
					}
				}
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("phone.jsp");
				requestDispatcher.forward(req, resp);
			}

}
