package week3;

/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main(String[]arg)
    {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        
        //System.out.println(Float.MAX_VALUE+"\n"+Float.MIN_VALUE);
         System.out.println("My name is \"r\"");
         
        byte b=12;
        
        byte d=13;
        
        //byte e=b+d; error ayo so exlicit casting
        
        byte e=(byte)(b+d);
        //float f=233.3f;
        //long l=200; by default int read garxa so use l
        
        long l=200l;
        
    int a=20;
    float g=2033f;
    double h=20334;
    
    //int x=a+g+h; typecasting gara 
    
    int x=(int)(a+g+h);
    
    char c='A';  //ascii value
    
    System.out.println((int)c);
    
    int length=10;
    int breadth=20;
    System.out.println("area is"+(length*breadth));
    
    
    int principle=500;
    int time=2;
    float rate=2.4f;
    System.out.println("SI is"+(principle+time+rate/100));
    
    
    
    
    
    
    
    
    
    
    
        
    
        
        
        


    }
}
