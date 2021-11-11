package com.bkap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bkap.client.CallWebService;
import com.bkap.entity.Messages;
import com.bkap.entity.Mobile;
import com.google.gson.Gson;

@WebServlet("/Insert")
public class Insert extends HttpServlet{
	private static final long serialVersionUID = 1L;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String MobName = request.getParameter("mobName");
		String Producer = request.getParameter("producer");
		float Price = Float.parseFloat(request.getParameter("price"));
		String Description = request.getParameter("description");
		

		Mobile mobile = new Mobile(MobName, Producer, Price, Description);
		CallWebService service = new CallWebService();
		String json = service.insert(mobile);

		
		Gson gson = new Gson();
		Messages mess = gson.fromJson(json, Messages.class);

		request.setAttribute("mess", mess);
		request.getRequestDispatcher("insert.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
