//command Line Argument
import java.lang.*;
public class command
{
    public static void main (String args[])
    {
        //pass the value of argument in run time
        for(int i=0;i<args.length;i++)
            System.out.println(args[i]);
    }

}