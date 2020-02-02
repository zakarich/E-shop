package com.gestion.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;


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
 * Servlet implementation class commande
 */
@WebServlet("/commande")
public class commande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public commande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.getRequestDispatcher("interface_client_Commande.jsp").forward(request, response);
		if(request.getSession().getAttribute("client")==null) {
			request.getRequestDispatcher("index1.jsp").forward(request, response);
		}else {
		doPost(request,response);}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		client clt=(client)request.getSession().getAttribute("client");
		int x=Integer.parseInt(request.getParameter("t"));
		LocalDate d=LocalDate.now();
		if(clt!=null&&x!=0) {
			commandebean cd=new commandebean(d,x,clt);
			Service s=new ServiceImpl(); 
			//cd.setclient(clt);
			System.out.println("00000000000000000000000000000000");
			s.ajoutecommande(cd,clt);
			System.out.println("1111111111111111111111111111111");
			/*PrintWriter out = response.getWriter();  
			response.setContentType("text/html");  
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Commande Avec Montant:'"+x+"' De Client:'"+clt.getCode()+"');");  
			out.println("location='interface_client_Commande.jsp';");
			out.println("</script>");*/
			request.getRequestDispatcher("article").forward(request, response);
		}
		//request.setAttribute("somme",d);
		
		
		
		
	}

}
