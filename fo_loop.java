import java.util.*;
public class fo_loop
{
    public static void main(String args[])
    {
        System.out.println("Enter your limit: "); 
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("\n"+i);
        }
    }
}