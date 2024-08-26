package OnlineBilling;

import java.util.Scanner;

public class dulex
{

	private int prize;
	boolean veg=false;
	Scanner in=new Scanner(System.in);
	
	 
		      public void normpizza()
		    	{
			
				 System.out.println("Order plzz! Which type of pizza 1.veg or 2.non-veg");
				 int useroption=in.nextInt();
				 	if(useroption==1)
				 	{
					 veg=true;	
					 this.prize=100;
				     System.out.print("Veg Pizza Rate: "+this.prize+"\n");
				 	}
				 	else 
				 	{
					 this.prize=200;
				     System.out.print("Veg Pizza Rate: "+this.prize+"\n");
				     }
				 	extratoppings();
				 	extracheese();
	           }
		   
		      
				public void extratoppings()
				{
				  this.prize+=50;
				  System.out.print("With Extra toppings Pizza Rate: "+this.prize+"\n");
				}

				public void extracheese()
				{
					this.prize+=60;
				 System.out.print("With Extra cheese Pizza Rate: "+this.prize+"\n");
				}
}