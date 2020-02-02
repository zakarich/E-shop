package com.gestion.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion.beans.client;
import com.gestion.business.Service;
import com.gestion.business.ServiceImpl;

/**
 * Servlet implementation class authentification
 */
@WebServlet("/authentification")
public class authentification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public authentification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code=request.getParameter("code");
		String password=request.getParameter("mdp");
		if(code!=""&&password!="") {
			Service s=new ServiceImpl(); 
			client clt=s.verification(code,password);
			if(clt==null) {
				PrintWriter out = response.getWriter();  
				response.setContentType("text/html");  
				out.println("<script type=\"text/javascript\">");  
				out.println("alert('Verifer vos informations le mot de passe ou le code est incorrect...');");  
				out.println("location='index1.jsp';");
				out.println("</script>");
				
			}
			else {
			String str="Bienvenue "+clt.getNom()+" dans votre Espace E-Shop";
			request.getSession().setAttribute("client", clt);
			request.getSession().setAttribute("str", str);
			request.getRequestDispatcher("interface_client.jsp").forward(request, response);}
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
