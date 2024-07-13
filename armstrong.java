import java.util.*;
public class armstrong
{
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a input: ");
        n=in.nextInt();
        arms(n);

    }
    static boolean arms(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n/=10;
           

            if(sum==original){
                System.out.println("true");
                return true;
            }
        }
       System.out.println("false");
        return false;
    }
}