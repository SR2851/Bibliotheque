package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AuteurDAO;
import DAO.IAuteurDAO;
import DAO.ILivreDAO;
import DAO.LivreDAO;
import Modele.Auteur;
import Modele.Livre;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/Save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Affichage.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Auteur auteur=new Auteur();
		auteur.setNom(request.getParameter("nom"));
		auteur.setPrenom(request.getParameter("prenom"));
		
		Livre livre=new Livre();
		livre.setTitre(request.getParameter("titre"));
		livre.setCategorie(request.getParameter("categorie"));
		livre.setIsbn(Integer.parseInt(request.getParameter("ISBN")));
		
		
		
		
		request.setAttribute("livre", livre);
		request.setAttribute("auteur", auteur);
		
		AuteurDAO daoA=new AuteurDAO();
		daoA.saveAuteur(auteur);
		LivreDAO daoL=new LivreDAO();
		daoL.saveBook(livre);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Affichage.jsp").forward(request,response);
		
	}

}
