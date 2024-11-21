package com.xworkz.jdbc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jdbc.dto.FanDto;
import com.xworkz.jdbc.service.FanServiceImpl;

@WebServlet(loadOnStartup = 1,urlPatterns = "/send")

public class FanServlet extends HttpServlet {
	
   public FanServlet() {
		System.out.println("no arg const in FanServlet");
	}
		
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String companyName=req.getParameter("companyName");
			String material=req.getParameter("material");
			String color=req.getParameter("color");
			String size=req.getParameter("size");		
			
			System.out.println(companyName);
			System.out.println(material);
			System.out.println(color);
			System.out.println(size);
			
			FanDto dto=new FanDto(companyName, material, color, size);
			
			FanServiceImpl service=new FanServiceImpl();
			service.save(dto);
			
		}

}
