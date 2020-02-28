import java.util.ArrayList;

import DAO.AuteurDAO;

import DAO.LivreDAO;
import Modele.Auteur;
import Modele.Livre;


public class test {
public static void main(String[] args) {
	
	
	//Livre livre=new Livre(2, "Philosophie", "ma vie", 2);
	//Auteur auteur=new Auteur(2, "Rosillette", "Samuel");
	
	LivreDAO daoL=new LivreDAO();
	//daoL.saveBook(livre);
	AuteurDAO daoA=new AuteurDAO();
	//daoA.saveAuteur(auteur);
	
	ArrayList<Livre> liste=new ArrayList<Livre>();
	liste= daoL.getLivre();
	
	for (int i = 0; i < liste.size(); i++) {
		System.out.println(liste.get(i).toString());
	}
	ArrayList<Auteur> liste2=new ArrayList<Auteur>();
	liste2= daoA.getAuteur();
	
	for (int i = 0; i < liste2.size(); i++) {
		System.out.println(liste2.get(i).toString());
	}
	
	
}
}
