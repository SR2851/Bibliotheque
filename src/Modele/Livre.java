package Modele;

public class Livre {
	private int isbn;
	private String categorie;
private String titre;
private int idAuteur;
public Livre(int isbn, String categorie, String titre, int idAuteur) {
	super();
	this.isbn = isbn;
	this.categorie = categorie;
	this.titre = titre;
	this.idAuteur = idAuteur;
}
public Livre() {
	super();
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	this.categorie = categorie;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public int getIdAuteur() {
	return idAuteur;
}
public void setIdAuteur(int idAuteur) {
	this.idAuteur = idAuteur;
}
@Override
public String toString() {
	return "Livre [isbn=" + isbn + ", categorie=" + categorie + ", titre=" + titre + ", idAuteur=" + idAuteur + "]";
}


}