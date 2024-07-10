import java.util.*;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the input: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int p=primee(n);
        System.out.println(p+"prime");
    }
   static int primee(int p)
   {
    int n=2;
    if(p<=1)
    return -1;
    while(n*n<=p){
          if(n%p==0){
            System.out.println(p+"is not prime");
            break;
          }     
          n=n+1;
    }
    return p;
   }
}
