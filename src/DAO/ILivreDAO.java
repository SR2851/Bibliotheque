package DAO;

import java.util.ArrayList;

import Modele.Livre;

public interface ILivreDAO {
	public ArrayList<Livre> getLivre();
	public int saveBook(Livre livre);
	public int dropBook(int isbn);
}
