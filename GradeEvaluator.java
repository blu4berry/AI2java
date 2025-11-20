import java.util.Scanner;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main (String[]arg)
    { 
        Scanner lo=new Scanner(System.in);
        
        System.out.println("enter marks");
        int marks=lo.nextInt();
          
        String result=(marks >=40)?"pass" :"fail";
        System.out.println("result is:" +result);
        
        
    

        
    }

}