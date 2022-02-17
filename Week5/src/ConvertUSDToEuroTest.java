import junit.framework.TestCase;

public class ConvertUSDToEuroTest extends TestCase
{

    // Test Number: 1
    // Test Objective: To test conversion of invalid values below 0.25 for exchangeRate
    // and invalid values below 100 for usd
    // Test input(s): USD = 87.94, exchangeRate = 0.12
    // Test expected output(s): -99.00

    public void testusdToEuro001()
    {
        ConvertUSDToEuro testObj = new ConvertUSDToEuro();
        assertEquals(-99.00, testObj.usdToEuro(87.94, 0.12),1.00);
    }


    // Test Number: 2
    // Test Objective: To test conversion of valid USD to Euro
    // Test input(s): USD = 750.00, exchangeRate = 0.88
    // Test expected output(s):660.36

    public void testusdToEuro002()
    {
        ConvertUSDToEuro testObj = new ConvertUSDToEuro();
        assertEquals(660.36, testObj.usdToEuro(750, 0.88),2.00);
    }

    // Test Number: 2
    // Test Objective: To test conversion of invalid above 2.80 for exchangeRate
    // and invalid values above 10000.00 for usd
    // Test input(s): USD = 11187.95, exchangeRate = 3.12
    // Test expected output(s):-99.00

    public void testusdToEuro003()
    {
        ConvertUSDToEuro testObj = new ConvertUSDToEuro();
        assertEquals(-99.00, testObj.usdToEuro(11187.95, 3.12),1.00);
    }
}// end of ConvertUSDToEuroTest