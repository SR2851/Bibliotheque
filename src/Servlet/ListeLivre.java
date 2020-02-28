package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AuteurDAO;
import DAO.LivreDAO;
import Modele.Auteur;
import Modele.Livre;

/**
 * Servlet implementation class ListeLivre
 */
@WebServlet("/ListeLivre")
public class ListeLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeLivre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Livre> liste=new ArrayList<Livre>();
		LivreDAO daoL=new LivreDAO();
		liste= daoL.getLivre();
		request.setAttribute("livres", liste);
		ArrayList<Auteur> listeA=new ArrayList<Auteur>();
		AuteurDAO daoA=new AuteurDAO();
		listeA= daoA.getAuteur();
		request.setAttribute("auteurs", listeA);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Listes.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
