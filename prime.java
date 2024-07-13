import java.util.*;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the input: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        primee(n);
        
    }
   static boolean primee(int p)
   {
    int c=2;
    if(p<=1)
    {
    return false;
    }
    while(c*c<=p){
          if(c%p==0){
            System.out.println(p+"is not prime");
            return false;
          } 
          c++;
    }
    return c*c>=p;
   }
}
