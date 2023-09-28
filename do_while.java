import java.util.Scanner;
public class do_while //exit control loop
 {
    public static void main(String args[])
    {
        int i=1;
        System.out.println("Enter your limits: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        do{
            System.out.println("\n"+i); 
            i++;
        }while(i<=n);
    }  
}
