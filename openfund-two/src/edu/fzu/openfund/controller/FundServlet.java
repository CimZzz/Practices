package edu.fzu.openfund.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.fzu.openfund.domain.Fund;
import edu.fzu.openfund.service.FundService;
import edu.fzu.openfund.service.FundServiceImpl;

/**
 * Servlet implementation class FundServlet
 */
public class FundServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FundServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		FundService service=new FundServiceImpl();
		List<Fund> list=service.getAllFunds();
		
		request.setAttribute("AllFunds", list);
		
		request.getRequestDispatcher("fund/showfund.jsp").forward(request, response);
	}
}
