import java.util.Scanner;

public class PrintName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your firstName");
        String firstName= in.next();
        System.out.println("please enter lastName");
        String LastName= in.next();
        if (firstName.length() <= 14 && firstName.length() >= 2 && LastName.length() <= 14 && LastName.length() >= 2)
        {
            System.out.println("The name inputted is: " + firstName + ", " + LastName);
        }
        else if (firstName.length() > 14 && LastName.length() > 14 )
        {
            System.out.println("ERROR: Name is too long please make it shorter");
        }
        else
        {
            System.out.println("ERROR: Name is too short please make it longer");
        }
    }
}
