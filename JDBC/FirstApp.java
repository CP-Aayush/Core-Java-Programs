import java.sql.*;

class FirstApp{
public static void main (String s[])
{
try{
	String dbUrl="jdbc:mysql://locahost:3306/student";
	String username="root";
	String password="user";
	Connection myConnection=DriverManager.getConnection(dbUrl,username,password);
	Statement myStatement=myConnection.createStatement();
	ResultSet myResultSet=myStatement.executeQuery("select * from students");

while (myResultSet.next()){
	System.out.println("Student fullname :"+myResultSet.getString(1)+myResultSet.getString(2));
	}
}
catch(Exception e){
	System.out.println(e);
}
}
}
	
