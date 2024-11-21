package com.xworkz.jdbc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jdbc.service.InstituteServiceimpl;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name = req.getParameter("name");
			InstituteServiceimpl instituteServiceimpl = new InstituteServiceimpl();
			String ref = instituteServiceimpl.deleteByName(name);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/delete.jsp");
			requestDispatcher.forward(req, resp);
		}

}
