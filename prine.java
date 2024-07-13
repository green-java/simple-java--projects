import java.util.*;
public class prine
{
    public static void main(String args[])
    {
        
        Scanner i=new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int num=i.nextInt();
        if(toprime(num)==1){
            System.out.println(num+" prime");
        }
        else if(toprime(num)==0)
        {
            System.out.println(num+"not prime");
        }
        else{
            System.out.println("invalid input");
        }
    }
    static int toprime(int num){
        
        if(num<=1){
            
            return -1;
        }
        
        
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(i%num==0)
            return 0;
        
        }
        return 1;//if condition is then return true 
        
    }
}