
//Class.forName: to load and register the driver we use this method
import java.sql.*;

public class DemoClass3 {

	public static void main(String[] args) throws Exception{
		//pqr pq=new pqr();
		//Class.forName("pqr");It will load the class pqr and call the static method
		//Class.forName("pqr").newInstance();//It will create the instance of class and call static and instance method.
		
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());//Instead of doing this we can write it as
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	}

}

class pqr
{
	static
	{
		System.out.println("In static");
	}
	
	//Instance Method
	{
		System.out.println("In Instance");
	}
}
