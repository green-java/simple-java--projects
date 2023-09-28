import java.lang.*;
import java.util.Scanner;
public class if_state {
    public static void main(String args[])
    {
        int age;
        System.out.println("Enter your age: ");
        Scanner in=new Scanner(System.in); 
        age=in.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible"); 
        }
    }
}
