import java.util.Scanner;

/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{
    public static void main(String[]arg)
    {
        /*
         * we use scanner to take input from user 
         * it is built-in type class
         */
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the firstNumber");
        int firstNumber=sc.nextInt();
        
        System.out.println("Enter the secondNumber");
        int secondNumber=sc.nextInt();
        
        
        int sum=firstNumber+secondNumber;
        System.out.println("sum of two number is"+sum);
        
        
        int bigger=(firstNumber>secondNumber)?firstNumber:secondNumber; //tunnary operartor
        System.out.println("GreatestNumber is"+bigger);
    
        
        
    
    
    
    
    
    }
}