package com.gestion.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.beans.client;
import com.gestion.business.Service;
import com.gestion.business.ServiceImpl;

/**
 * Servlet implementation class AddClient
 */
@WebServlet("/AddClient")
public class AddClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		if(request.getSession().getAttribute("client")==null) {
			request.getRequestDispatcher("index1.jsp").forward(request, response);
		}
		else {
			doPost(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String code=request.getParameter("code"); 
		String psw=request.getParameter("mdp"); 
		String name=request.getParameter("nom"); 
		String adr=request.getParameter("addresse"); 
		String ville=request.getParameter("ville"); 
		if(code!=""&&psw!=""&&name!=""&&adr!=""&&ville!=""){ 
			Service s=new ServiceImpl(); 
			s.ajouterUsers(code, psw, name, adr, ville);
			client clt=new client(code, psw, name, adr, ville);
			request.getSession().setAttribute("client", clt);
			String str="Bienvenue "+clt.getNom()+" dans votre Espace E-Shop";
			//request.setAttribute("str", str);
			request.getSession().setAttribute("str",str);
			
	        request.getRequestDispatcher("interface_client.jsp").forward(request, response);
		}
	}
	

}
