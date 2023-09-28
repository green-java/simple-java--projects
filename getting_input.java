import java.lang.*;
import java.util.Scanner;
public class getting_input {
    public static void main(String args[])
    {
        int a,b,c;
        float s,r,g;
        //calculate quadratic formula a^2+b^2+2ab
        Scanner in=new Scanner(System.in); //'in' is the object for Scanner class
        System.out.println("Enter integer a value: "); 
        a=in.nextInt(); //get int value using 'in' obj
        System.out.println("Enter integer b value: "); 
        b=in.nextInt();
        System.out.println("Enter float s value: "); //get float value using 'in' obj
        s=in.nextFloat();
        System.out.println("Enter float r value: ");  
        r=in.nextFloat();
        c=(a*a)+(b*b)+(2*a*b);
        g=(s*s)+(r*r)+(2*s*r);
        System.out.println("integer type  : "+(c)); 
        System.out.println("float type : "+(g)); 
    }
}
