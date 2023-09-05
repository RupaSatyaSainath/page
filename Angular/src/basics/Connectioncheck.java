package basics;
import java.sql.*;

public class Connectioncheck {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
				// 1.add an external my sql connector jar file
				//2.create a variable foe connector class 
				// connection class is the only class which can able to store the exact database links which will be available inside the sql
				// library file
				Connection cn = null;
				//3.Driver class to the project using Class.for
				//which is used to check the first whether class is available 
				//available adds the Class. if not, throw an exception 
				//the exception by adding throws for ClassNotFoundException 
				Class.forName("com.mysql.cj.jdbc.Driver");
				//4.create a connection ip path with db name , user name , user password 
				cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","KrSsN@128");
				//5.check connection 
				if(cn!=null)
					System.out.println("Connection successful");
				else
					System.out.println("Connection is fail !");
			}
		
	

}
