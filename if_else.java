import java.util.Scanner;
import java.lang.*;
public class if_else {
    public static void main(String args[]){
        int year;
        System.out.println("Enter year: ");
        Scanner in=new Scanner(System.in);
        year=in.nextInt();
        if(year%4==0 || (year%100==0 && year%400==0))
        {
            System.out.println("Year"+year+"is a leap year"); 
        } 
        else
        {
            System.out.println("Year"+year+"is not leap year"); 
        }
    }
}
