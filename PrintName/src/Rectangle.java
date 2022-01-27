import java.util.Scanner;
public class Rectangle
{
    public static void main(String[] args)
    {
        int length = 0;
        int width = 0;

        Scanner s = new Scanner(System.in);

        while(true)
        {
            System.out.println("Please enter the length");
            length = s.nextInt();

            System.out.println("Please enter the Width");
            width = s.nextInt();

            if(length > 0 && width > 0 && length != width)
            {
                System.out.println(length + width);
                break;
            }
            else if(length < 0 || width < 0)
            {
                System.out.println("FATAL ERROR: LENGTH AND WIDTH CANT BE LESS THAN ZERO");
            }
            else
            {
                System.out.println("FATAL ERROR: LENGTH AND WIDTH CANT BE THE SAME");
            }
        }

        for(int i= 0; i < width; i++)
        {
            for(int j = length; j > 0; j--)
            {
                if( i ==0 || i == width-1)
                {
                    System.out.print("-");
                }
                else if(j==1|| j == length)
                {
                    System.out.print("|");
                    System.out.print(" ");

                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}