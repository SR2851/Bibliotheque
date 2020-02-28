package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modele.Livre;

public class LivreDAO implements ILivreDAO {

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
	public ArrayList<Livre> getLivre() {
	try {
		Connection con= Connexion();
		String sql="select*from Livre";
		PreparedStatement pre=con.prepareStatement(sql);
		ResultSet rs=pre.executeQuery();
		ArrayList<Livre> liste=new ArrayList<Livre>();
		
		while(rs.next()) {
			liste.add(new Livre(rs.getInt("isbn"),rs.getString("categorie"),rs.getString("titre"),rs.getInt("idAuteur")));
		}
		return liste;
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
	}

	@Override
	public int saveBook(Livre livre) {
		try {
			Connection con=Connexion();
			String sql="insert into Livre values(?,?,?,?)";
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setInt(1,livre.getIsbn());
			pre.setString(2, livre.getCategorie());
			pre.setString(3, livre.getTitre());
			pre.setInt(4, livre.getIdAuteur());
			pre.executeUpdate();
			System.out.println("livre ajouté");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("livre non ajouté");
		}return 0;
	}

	@Override
	public int dropBook(int isbn) {
		try {
			Connection con=Connexion();
			Statement stm=con.createStatement();
			stm.execute("delete from Livre where isbn="+isbn);
			System.out.println("Livre supprimé");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
