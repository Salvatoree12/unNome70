package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.UserDAO;
import model.User;

/**
 * Servlet implementation class ListaUtenti
 */
@WebServlet("/ListaUtenti")
public class ListaUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaUtenti() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Inizio Do Get Lista Utenti, qualcosa di simile");
		
		List <User> utenti = UserDAO.selectAllUsers();
		System.out.println(utenti);
		request.setAttribute("ListaUtenti", utenti);
		request.getServletContext().getRequestDispatcher("/body-list.jsp").include(request, response); //con l'include risponde lo /, con il forward risponde l'ultima risorsa interpellata
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
