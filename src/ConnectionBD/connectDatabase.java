package ConnectionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class connectDatabase {
	
	private Connection con;
	private String state;
	public connectDatabase(){
			try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gestionbar","root","");
		  state="Reussie";
			
		} catch (ClassNotFoundException e) {
			state="Pas de pilote pour DB";
			e.printStackTrace();
		} catch (SQLException e) {
			state="Pas de connexion a la DB";
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public Connection getCon() {
		return con;
	}


	public void setCon(Connection con) {
		this.con = con;
	}


	public ResultSet extaireData(String requete){
            ResultSet result=null;
		
		try {
			result=con.createStatement().executeQuery(requete);
			state="Reussie";
		} catch (SQLException e) {
			state="Echoue";
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public int updateData(String requete){
		int n=0;
		try {
			n=con.createStatement().executeUpdate(requete);
			state="Reussie";
		} catch (SQLException e) {
			state=" Echouez !!! ";
			e.printStackTrace();
		}
		return n;
	}
	
	public static void main(String args[])
        {
            connectDatabase connexion = new connectDatabase();
            ResultSet flux = connexion.extaireData("select *  from personne");
            
            try {
                while(flux.next())
                {
                    System.out.println(""+flux.getInt("id")+"  "+flux.getString("nom")+"  "+flux.getInt("age")+" "+flux.getFloat("salaire"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(connectDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

}
