import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class STUDENT {

	public static void main(String[] args)throws Exception
	{
		try {
			//driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection = getConnection(URL,Username,Password);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "Kavitha@123");
					System.out.println("Connection Established");
			//statement
			Statement s = con.createStatement();
			//sendQurrey
			String sql = "insert into student"+"(id,NAME,MARK1,MARK2,TOTAL)"+"values(6,'dudu',90,90,180)";
			
			s.executeUpdate(sql);
			System.out.println("Insertion is Completed");
			//ResultSet
			ResultSet rs = s.executeQuery("select*from student");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(5));
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	

	}

}
