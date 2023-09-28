import java.util.Scanner;
public class while_loop //Entry Controlled loop
{
    public static void main(String args[])
    {
        System.out.println("Enter the limit: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=0;
        while(i<=n)
        {
        System.out.println("\n"+i);
        i++;  
        }
    }
}
