package com.project.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dao.model.PartsImplementation;
import com.project.model.Parts;

/**
 * Servlet implementation class PartsServlet
 */
@WebServlet("/PartsServlet")
public class PartsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PartsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Parts parts = new Parts();
		PartsImplementation pImpl = new PartsImplementation();
		List<Parts> partsList=pImpl.getAllParts();

		try {
			
			
			if (request.getParameter("sku") != null)
				parts.setDateReceived(request.getParameter("Date_Received"));

			parts.setProductName(request.getParameter("Product_Name"));
			parts.setSerialNos(request.getParameter("Serial_Nos"));
			parts.setSku(request.getParameter("sku"));

			if (request.getParameter("add") != null) {
				pImpl.addParts(parts);
				request.setAttribute("partsList", partsList);
				
			} else if (request.getParameter("update") != null) {
				pImpl.editParts(parts);
				request.setAttribute("partsList", partsList);
				
			} else if (request.getParameter("partsSkuDelete") != null) {
				pImpl.removeParts(request.getParameter("partsSkuDelete"));
				request.setAttribute("partsList", partsList);
				
			} else if (request.getParameter("editSku") != null) {
				parts = pImpl.getParts(request.getParameter("editSku"));

				request.setAttribute("parts", parts);
				
				
				RequestDispatcher rd = request.getRequestDispatcher("AddNew.jsp");
				rd.forward(request, response);
				return;
			}

			RequestDispatcher rd = request.getRequestDispatcher("TablePage.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
