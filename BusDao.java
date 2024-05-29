package busreservation;

import java.sql.*;

public class BusDao //Bus data access object
{
    public void displayBusInfo() throws SQLException
    {
       String query="Select * from bus";

       Connection con= DbConnection.getConnections();
       Statement st= con.createStatement();
       ResultSet rs=st.executeQuery(query);

        while(rs.next())
        {
            System.out.print("Bus_id: " +rs.getInt(1));
            System.out.print(rs.getInt(2) ==1? "  Ac:Yes":"  Ac:No");
            System.out.println("  Capacity: "+rs.getInt(3));
        }
        System.out.println("-------------------------------------");
        con.close();

    }

    public int getCapacity(int id) throws SQLException
    {
        String query="select Capacity from bus where Id="+id;
        Connection con= DbConnection.getConnections();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);

       rs.next();
       return rs.getInt(1);

        
    }
}
