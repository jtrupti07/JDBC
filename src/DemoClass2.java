import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//How to Insert Records dynamically
//DAO-> Data Access Object
public class DemoClass2 {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/Demo";
		String uname="root";
		String pass="Trupti@0704";
		int userid=6;
		String username="Dipali";
		String query="insert into demotb values(?,?)";

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1,userid);
		st.setString(2,username);
		int count=st.executeUpdate();
		
		System.out.println(count+" row/s affected");
			
		
		
		
		st.close();
		con.close();

	}

}
