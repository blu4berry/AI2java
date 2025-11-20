import java.util.Scanner;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]arg)

    {
        Scanner hi=new Scanner(System.in);
        
        System.out.println("enter first number");
        int fnumber=hi.nextInt();
         
        System.out.println("enter second number");
        int snumber=hi.nextInt();
        
        System.out.println("sum is" +"/n"+(fnumber+snumber));
        System.out.println("subtraction is" +"/n" +(fnumber-snumber));
        System.out.println("multiplication is"+"/n" + (fnumber*snumber));
        System.out.println("division is:" +"/n"+ (fnumber/snumber));
        System.out.println("modulus is:" +"/n" + (fnumber%snumber));
        
        
        
    
    }
}
