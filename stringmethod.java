import java.lang.*;
public class stringmethod {
   public static void main(String[] args) {
       greeting("hello","Guys","Have","a","Great day");
   } 
   static String greeting(String s,String t,String r,String i,String g)
   {
    System.out.println(s+t+r+i+g+"for you"); //changed the string
    return s; //but return only hello
   }
}
