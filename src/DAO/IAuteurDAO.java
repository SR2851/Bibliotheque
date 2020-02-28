package DAO;

import java.util.ArrayList;

import Modele.Auteur;


public interface IAuteurDAO {
public ArrayList<Auteur> getAuteur();
public int saveAuteur(Auteur auteur);
public int dropAuteur(int idAuteur);
}
