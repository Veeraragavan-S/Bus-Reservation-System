package busreservation;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking 
{
    String passengerName;
    int busNo;
    Date date;
    
    @SuppressWarnings("resource")
    Booking()
    {

        System.out.println("Enter name of passenger: ");
        passengerName = new Scanner(System.in).nextLine();
        System.out.println("Enter bus number: ");
        busNo = new Scanner(System.in).nextInt();
        System.out.println("Enter date in dd-mm-yyyy");
        String dateInput =new Scanner(System.in).next();

        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }

        public boolean isAvailables() throws SQLException
        { 
            BusDao busDao=new BusDao();
            int capacity= busDao.getCapacity(busNo);

            BookingDao bookingDao=new BookingDao();
            int booked=bookingDao.getBookedCount(busNo,date);
            
            return booked<capacity;
        }











    
}