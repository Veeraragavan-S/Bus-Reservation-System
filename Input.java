package busreservation;
import java.util.*;

public class Input 
{
    public static void main(String[] args) 
    {
    Scanner objScanner=new Scanner(System.in);

    int userOpt=1;
    while(userOpt==1)
    {   
        System.out.println("Enter 1 to book and 2 to exit");
        userOpt =objScanner.nextInt();
    }
    objScanner.close();

    }
}
