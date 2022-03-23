import junit.framework.TestCase;

public class generate_gradingTest extends TestCase {

    // Test #: 1
    // Objective: Convert Grade to "A"
    // Input(s): cw = "24" , exam = "70"
    // Expected Output: A

    public void testgenerate_grading001() {
    try
    {
        generate_grading testObj = new generate_grading();

        assertEquals(94.0 , testObj.calculateGrades(24 , 70));
    }
    catch(InvalidException e)
    {
        fail("no exception expected");
    }

    }


    // Test #: 2-
    // Objective: Convert Grade to "B"
    // Input(s): "15" , exam = "52"
    // Expected Output: B

    public void testgenerate_grading002() {

        try
        {
            generate_grading testObj = new generate_grading();

            assertEquals(67.0, testObj.calculateGrades(15 , 52));
        }

        catch(InvalidException e)
        {
            fail("no exception expected");
        }

    }

    // Test #: 3
    // Objective: Convert Grade to "C"
    // Input(s): "15" , exam = "30"
    // Expected Output: C

    public void testgenerate_grading003() {

        try
        {
            generate_grading testObj = new generate_grading();

            assertEquals(45.0 , testObj.calculateGrades(15 , 30));
        }
        catch(InvalidException e)
        {
            fail("no exception expected");
        }
    }

    // Test #: 4
    // Objective: Convert Grade to "D"
    // Input(s): "10" , exam = "10"
    // Expected Output: D

    public void testgenerate_grading004() {

        try
        {
            generate_grading testObj = new generate_grading();

            assertEquals(20.0 , testObj.calculateGrades(10 , 10));
        }
        catch(InvalidException e)
        {
            fail("no exception expected");
        }

    }

    // Test #: 5
    // Objective: Convert invalid value
    // Input(s): "27" , exam = "70"
    // Expected Output: -99



    // Test #: 6
    // Objective: Convert invalid value
    // Input(s): "-2" , exam = "70"
    // Expected Output: -99



    // Test #: 7
    // Objective: Convert invalid value
    // Input(s): "24" , exam = "80"
    // Expected Output: -99



    // Test #: 8
    // Objective: Convert invalid value
    // Input(s): "24" , exam = "-60"
    // Expected Output: -99
}