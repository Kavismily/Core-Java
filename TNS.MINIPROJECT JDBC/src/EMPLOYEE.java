	import java.sql.DriverManager;
import java.sql.ResultSet;
	import java.sql.Statement;
import java.sql.Connection;

	public class EMPLOYEE {
public static void main(String[] args)throws Exception
		{
			try {
				//driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//connection = getConnection(URL,Username,Password);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "Kavitha@123");
						System.out.println("Connection Established");
				//statement
				Statement stmt = con.createStatement();
				System.out.println("statement created");
				//sendQurrey
				//insert
				String sql = "insert into employee"+"(EMPID,NAME,DESIGNATION, MOBILE,SALARY)"+"values(155,'meow','developer', 997645, 24000)";
				
			
				System.out.println("Insertion is Completed");
				//delete
				String deletequery="DELETE FROM employee WHERE EMPID=102";
				System.out.println("deletion is completed");
				//update
				String updatequery="UPDATE employee SET SALARY=90000 WHERE SALARY=30000";
				System.out.println("updated is done");
			   
				stmt.executeUpdate(sql);
				stmt.executeUpdate(deletequery);
				stmt.executeUpdate(updatequery);
				System.out.println("retrieve is done");
				//resultset
				ResultSet rs = stmt.executeQuery("select*from employee");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"/t"+rs.getString(2)+"/t"+rs.getString(3)+"/t"+rs.getInt(4)+"/t"+rs.getInt(5));
				}
			

		
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		

		}

	}



