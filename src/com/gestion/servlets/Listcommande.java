package com.gestion.servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.beans.client;
import com.gestion.beans.commandebean;
import com.gestion.business.Service;
import com.gestion.business.ServiceImpl;

/**
 * Servlet implementation class Listcommande
 */
@WebServlet("/Listcommande")
public class Listcommande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listcommande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		if(request.getSession().getAttribute("client")==null) {
			request.getRequestDispatcher("index1.jsp").forward(request, response);
		}
		else {
		client clt=(client)request.getSession().getAttribute("client");
		Service s=new ServiceImpl(); 
		List<commandebean>l=s.lister_commande(clt);
		
		/*for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getSomme());
			}
		}*/
		request.setAttribute("listcmd", l);
		request.getRequestDispatcher("listecmd.jsp").forward(request,response);
		}
		}

}
