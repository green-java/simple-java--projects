import java.util.Scanner;
public class nested_if {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Married status: M/U ");
        char marital=in.next().charAt(0);
        if(marital=='U'|| marital=='u')//nested if condition
        {
            System.out.println("Enter your gender: M/F ");
            char gender=in.next().charAt(0);
            System.out.println("Enter your age: "); 
            int age=in.nextInt();
            if((gender=='F'||gender=='f') && age>=25 )
            {
                System.out.println("you are eligible for Insurance"); 
            } 
            else if((gender=='M'||gender=='m') && age>=35)
            {
                System.out.println("You are eligible for Insurance"); 
            }
            else
            {
                System.out.println("You are not eligible for Insurance"); 
            }
        } 
        else if(marital=='M' || marital=='m')
        {
            System.out.println("You are eligible for Insurance");
        } 
        else
        {
            System.out.println("Invalid input "); 
        }
    }
}
