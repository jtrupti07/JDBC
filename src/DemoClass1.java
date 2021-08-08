

//Insert Records into Database


import java.sql.*;


public class DemoClass1 {
	public static void main(String[] args)throws Exception {

	String url="jdbc:mysql://localhost:3306/Demo";
	String uname="root";
	String pass="Trupti@0704";
	//String query="select uname from demotb where uid=2";
	String query="insert into demotb values(6,'sanu')";

	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	Statement st=con.createStatement();
	int count=st.executeUpdate(query);
	
	System.out.println(count+" row/s affected");
		
	
	
	
	st.close();
	con.close();

	}

}
