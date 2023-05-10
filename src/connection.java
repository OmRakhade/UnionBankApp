import java.sql.*;
public class connection {
    Connection c;
    Statement s;
    public connection()
    {
     try {
           String url="jdbc:mysql://localhost:3306/bankmangmentsys";
           c =DriverManager.getConnection(url,"root","123456123");
           s = c.createStatement();
            
        } catch (Exception e) {
           System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));

        new connection();
    }
    public PreparedStatement prepareStatement(String query) {
        return null;
    }
}
