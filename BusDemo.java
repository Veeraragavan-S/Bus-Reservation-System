package busreservation;

import java.util.Scanner;
import java.sql.*;

public class BusDemo 
{
    public static void main(String[] args) throws SQLException 
    {
        BusDao busDao=new BusDao();
        
            busDao.displayBusInfo();
            int userOpt;
            
            Scanner objScanner=new Scanner(System.in);
            System.out.println("Enter no of passengers: ");
            userOpt=objScanner.nextInt();
        
            if (userOpt < 0 || userOpt >= 10) 
            {
                System.out.println("Not within range\nEnter greater than 0 or less than 10");   
                
            }

            for (int i=1; i<=userOpt;i++)
            {
                Booking booking = new Booking(); 
                if (booking.isAvailables())
                {
                    BookingDao bookingDao=new BookingDao();
                    bookingDao.addBooking(booking);
                    System.out.println("Your booking is confirmed :)");
                }
                else
                    System.out.println("Sorry.Bus is full.Try another bus or date.");
            }
        
            objScanner.close();
    }                   
    
}
