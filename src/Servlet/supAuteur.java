package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AuteurDAO;
import Modele.Auteur;

/**
 * Servlet implementation class supAuteur
 */
@WebServlet("/supAuteur")
public class supAuteur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public supAuteur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/ListeAuteurs.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Auteur auteur=new Auteur();
		auteur.setIdAuteur(Integer.parseInt(request.getParameter("idAuteur")));
		
		AuteurDAO daoA=new AuteurDAO();
		daoA.dropAuteur(auteur.getIdAuteur());
		this.getServletContext().getRequestDispatcher("/WEB-INF/auteursupprimé.jsp").forward(request,response);
	}

}
