package ConnectionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connexion {
	Connection con;

	public Connexion(){
		   
            try{
		Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionbar","root","");
			//String database ="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=gestionStock.mdb;";
			//Connection con = DriverManager.getConnection(database, "", "");
			System.out.println(" Connectée !!");
	}
		catch(Exception e){
		JOptionPane.showMessageDialog(null,"Oops! Vous n'êtes pas connectée à la base de donnée !!");
			
		}

}
	public Connection connecion(){
		return con;
	}
}