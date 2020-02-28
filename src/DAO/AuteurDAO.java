package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modele.Auteur;


public class AuteurDAO implements IAuteurDAO {
	
	private Connection Connexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		String url="jdbc:mysql://localhost:3306/Bibliotheque";
		String user="root";
		String password="";
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("connexion réussie");
		return con;
		}
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println("connexion échouée");
			return null;
		}
	}

	@Override
	public ArrayList<Auteur> getAuteur() {
		try {
			Connection con= Connexion();
			String sql="select*from Auteur";
			PreparedStatement pre=con.prepareStatement(sql);
			ResultSet rs=pre.executeQuery();
			ArrayList<Auteur> liste=new ArrayList<Auteur>();
			
			while(rs.next()) {
				liste.add(new Auteur(rs.getInt("idAuteur"),rs.getString("nom"),rs.getString("prenom")));
			}
			return liste;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int saveAuteur(Auteur auteur) {
		try {
			Connection con=Connexion();
			String sql="insert into Auteur values(?,?,?)";
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setInt(1, auteur.getIdAuteur());
			pre.setString(2, auteur.getNom());
			pre.setString(3, auteur.getPrenom());
			pre.executeUpdate();
			System.out.println("auteur ajouté");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}return 0;
	}

	@Override
	public int dropAuteur(int idAuteur ) {
		try {
			Connection con=Connexion();
			Statement stm=con.createStatement();
			stm.execute("delete from Auteur where idAuteur="+idAuteur);
			System.out.println("Auteur supprimé");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
