package com.gestion.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.gestion.beans.articlebean;
import com.gestion.beans.client;
import com.gestion.business.Service;
import com.gestion.business.ServiceImpl;
import com.gestion.dao.HibernateUtile;

/**
 * Servlet implementation class article
 */
@WebServlet("/article")
public class article extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public article() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("client")==null) {
			request.getRequestDispatcher("index1.jsp").forward(request, response);
		}
		else {
		List<articlebean> users=new ArrayList<articlebean>();   
		users.add(new articlebean(0,"Clé Usb 32 GO",50));       
		users.add(new articlebean(1,"Projecteur c15 ",700));       
		users.add(new articlebean(2,"Ellitbook hp",350));   
		request.setAttribute("users", users);
		request.getRequestDispatcher("interface_client_Article.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
