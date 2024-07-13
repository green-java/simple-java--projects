import java.util.*;
public class fibonacci {
    static int c;
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the input: ");
        int n=in.nextInt();
        System.out.println("The fibonacci of n: "+fibo(n));
    }
    //fibonacci of the given number 
    static int fibo(int n) //0 1 1 2 3 5 8 13 21 34 55 .......
    {
        int a=0;
        int b=1;
        
        for(int i=2;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
