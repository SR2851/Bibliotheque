import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDB {

	private String url="jdbc:mysql://localhost:3306/Bibliotheque";
	private String user="root";
	private String password="";
	private static ConnexionDB instance;
	
private Connection Connexion() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
		
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
	
	private ConnexionDB() {
		
	}
	public static ConnexionDB getInstance() {
		if(instance==null) {
			instance=new ConnexionDB();
			return instance;
		}
		return null;
	}
}
