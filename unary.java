public class unary {
    public static void main(String args[])
    {
        int a=10;
        System.out.println("default a="+a); //before increment a=10
        a++;
        System.out.println("incre a: "+a); //after increment a=11
        a--;
        System.out.println("decre a: "+a); //after decrement a=10
        System.out.println("\n");
        int b=15;
        System.out.println("default b: "+b); 
        System.out.println("post incre b: "+b++);       //post increment = print b value then increment b
        System.out.println("cuurent b: "+b);            //current value of b
        System.out.println("pre incre b: "+(++b));     //pre increment = print incremented value of b
        System.out.println("\n");
                      //decrement
        System.out.println("post decre b: "+b--);        //post decrement = print b value then decrement b
        System.out.println("cuurent b: "+b);             //current value of b
        System.out.println("pre decre b: "+(--b));       //pre decrement = print decremented value of  b  
        
    }
}
