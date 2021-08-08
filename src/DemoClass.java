

//jdbc-Java Database Connectivity
//Database connectivity 

import java.lang.*;

import java.sql.*;


public class DemoClass {

	public static void main(String[] args)throws Exception {
		
		String url="jdbc:mysql://localhost:3306/Demo";
		String uname="root";
		String pass="Trupti@0704";
		//String query="select uname from demotb where uid=2";
		String query="select * from demotb";

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String userdata="";
		
	while(rs.next())
	{
	    userdata=rs.getInt(1)+":"+rs.getString(2);
		
		//String name=rs.getString("uname");
		
		System.out.println(userdata);
	}
		
		
		
		st.close();
		con.close();
		

	}

}
