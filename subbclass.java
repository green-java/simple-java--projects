package OnlineBilling;
import java.util.*;
import java.sql.*;
public class subbclass {

	 int prize;
	private boolean veg=false;
	Scanner in=new Scanner(System.in);
	public void normalpizza() throws SQLException
	{
		
		 System.out.println("Order plzz! Which type of pizza 1.veg or 2.non-veg");
		 int useroption=in.nextInt();
		 if(useroption==1)
			 veg=true;	
		 
		 normalpizzaprice(veg);
		 boolean t=true;
		 
		 
		 while(t)
		 {
		 System.out.println("If any extra \t 1. Toppings \t 2. With Cheesse");
	
		 int ui=in.nextInt();
		 System.out.print("Veg Pizza Rate: "+this.prize+"\n");
		      if(ui==1)
		      {
		          extratoppings();
		          t=false;
		       }
		      else if(ui==2)
		      {
		           extracheese();
		           t=false;
	          }
		      else
		      {
		           System.out.println("No more addings");
		            t=false;
		      }
		
		  }
	}
	
	  public void normalpizzaprice(boolean veg)
	 {
		 
		if(veg)
		{
			this.prize=100;
			
		}
		else
		{
			this.prize=200;
			System.out.print("Non-Veg Pizza Rate: "+this.prize+"\n");
		}
		
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
	
	public void Packback()
	{
	
		
		
			this.prize+=20;
			  System.out.print("With Extra toppings Pizza Rate: "+this.prize);
		
	}
		
}