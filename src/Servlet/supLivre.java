package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LivreDAO;
import Modele.Livre;

/**
 * Servlet implementation class supLivre
 */
@WebServlet("/supLivre")
public class supLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public supLivre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Listes.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Livre livre=new Livre();
		livre.setIsbn(Integer.parseInt(request.getParameter("isbn")));
		
		LivreDAO daoL=new LivreDAO();
		daoL.dropBook(livre.getIsbn());
		this.getServletContext().getRequestDispatcher("/WEB-INF/livresupprimé.jsp").forward(request,response);
	}

}
