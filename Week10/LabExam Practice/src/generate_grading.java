import java.util.Scanner;

public class generate_grading
{
    double calculateGrades (double cw , double exam) throws InvalidException
    {
        double overallMark = exam + cw;
        char grade = ' ';

        if(exam < 0 || exam > 75 || cw < 0 || cw > 25)
        {
           throw  new InvalidException("please enter valid numbers");
        }
        if(overallMark >= 75)
        {
            grade = 'A';
        }
        else if(overallMark >= 50 && overallMark < 70)
        {
            grade = 'B';
        }
        else if (overallMark >= 30 && overallMark < 50)
        {
            grade = 'C';
        }
        else
        {
            grade = 'D';
        }
        return grade;

    }

}
