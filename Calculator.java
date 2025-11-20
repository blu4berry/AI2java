import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main (String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter firstnumber");
        int fnumber=sc.nextInt();
        
        System.out.println("Enter secondnumber");
        int snumber=sc.nextInt();
        
        System.out.println("sum is:" + (fnumber+snumber));
        System.out.println("subtraction is:" + (fnumber-snumber));
        System.out.println("multiplication is:" + (fnumber*snumber));
        System.out.println("division is:" + (fnumber/snumber));
        System.out.println("modulus is:" + (fnumber%snumber));
        
        
        
        
        
        
        
        
        

    }
}