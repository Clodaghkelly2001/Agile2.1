import junit.framework.TestCase;

public class ConvertUSDToEuroTest extends TestCase
{

    // Test Number: 1
    // Test Objective: To test conversion of valid USD to Euro
    // Test input(s): USD = 50, exchangeRate = 0.87
    // Test expected output(s): 43.69

    public void testusdToEuro001()
    {
        ConvertUSDToEuro testObj = new ConvertUSDToEuro();
        assertEquals(43.69, testObj.usdToEuro(50, 0.87),1.00);
    }


    // Test Number: 2
    // Test Objective: To test conversion of valid USD to Euro
    // Test input(s): USD = -10, exchangeRate = 0.87
    // Test expected output(s):-8.70

    public void testusdToEuro002()
    {
        ConvertUSDToEuro testObj = new ConvertUSDToEuro();
        assertEquals(-8.70, testObj.usdToEuro(-10, 0.87),1.00);
    }

}// end of ConvertUSDToEuroTest