package busreservation;

import java.sql.*;

public class DbConnection 
{
    private static final String url="jdbc:mysql://localhost:3306/busresv";
    private static final String user="root";
    private static final String password="8055";
    
    public static Connection getConnections() throws SQLException
    {
        return DriverManager.getConnection(url, user, password);
    }
}
