import java.util.*;
public class switch_case {
    public static void main(String args[])
    {
        int a,b,c;
        System.out.println("1. Addition"); 
        System.out.println("2. Subtraction"); 
        System.out.println("3. Divison"); 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a and b value: ");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Enter your choice: 1/2/3 "); 
        int ch=in.nextInt();
        switch(ch)
        {
            case 1:
                 System.out.println("Addition");
                 c=a+b;
                 System.out.println(c);
                 break;
            case 2:
                 System.out.println("Subtraction");
                c=a-b;
                System.out.println(c);
                break;
            case 3:
                System.out.println("Division");
                c=a%b;
                System.out.println(c); 
                break;
            default:
                System.out.println("Invalid input");  
                break;
        }
    }
}
