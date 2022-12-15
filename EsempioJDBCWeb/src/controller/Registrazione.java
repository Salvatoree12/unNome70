package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.UserDAO;
import model.User;

/**
 * Servlet implementation class Registrazione
 */
@WebServlet("/Registrazione")
public class Registrazione extends HttpServlet {
	 private static final long serialVersionUID = 1L;
     private UserDAO userDAO;
     private List<User> utenti = new ArrayList<User>();
     private ServletRequest request; 
     

   
     
    public Registrazione() {
    	
        super();
        
    }
    
    public void init() {
        userDAO = new UserDAO();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Entro dentro la servlet");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String citta = request.getParameter("citta");
		User utenti = new User(nome,email,citta);
		System.out.println(utenti);
		System.out.println("Query di inserimento eseguita");
		try {
			userDAO.insertUser(utenti);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("EsempioJDBCWeb/body-list.jsp");
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
