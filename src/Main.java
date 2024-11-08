import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String url ="jdbc:postgresql://localhost:5432/demo";
        String uname= "postgres";
        String pass= "Derby+254s1";



        Class.forName("org.postgresql.Driver");
        Connection  conn= DriverManager.getConnection(url, uname, pass);

        System.out.println("Connection Established");
    }
}