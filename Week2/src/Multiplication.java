import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Multiplication
{
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int product = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number1 = s.nextInt();
        System.out.println("Enter a number: ");
        number2 = s.nextInt();
        System.out.println("Enter a number: ");
        number3 = s.nextInt();

        if (number1 > 0 && number2 > 0 && number3 > 0) {
            product = number1 * number2 * number3;
            System.out.println("The product is: " + product);
        }
        else
        {
            System.out.println("ERROR: INVALID INPUT ENTERED");
        }
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            number1 =Integer.parseInt(br.readLine());
        }
        catch (NumberFormatException | IOException e)
        {
            throw new IllegalArgumentException();
        }

    }
}
