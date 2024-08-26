package OnlineBilling;
import java.sql.SQLException;
import java.util.*;

public class Main {
static int id=0;
static int id1=0;
	public static void main(String[] args) throws SQLException 
	{

		 Scanner in=new Scanner(System.in);
		System.out.println("\t \t Welcome to Truest Maker! Pizza  ");
		System.out.println(" \t \t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  ");
		
		System.out.println("Press 1-Normal Pizza   2-Dulex Pizza  ");
		int userchoice=in.nextInt();
		old o=new old(userchoice);
		in.close();
	}
}
	 class neew 
	{	
		
		public neew(int userchoice) throws SQLException 
		{
		subbclass sc=new subbclass();
		
	
		try
		{
	
			if(userchoice==1)
			{
			 sc.normalpizza();
			}
			else if(userchoice==2)
			{
			dulex d=new dulex();
			d.normpizza();
			}
			else
			{
			System.out.println("Invalid user choice");
			}
		
		}
	     catch(Exception e)
	     {
		    System.out.println(e);
	     } 
		}
   }
	
			
	class old extends neew 
	{	

		private int Normal_pizza;
		private int Dulex_pizza;
		private int SNO;
		 
		public old(int userchoice) throws SQLException 
		{
		super(userchoice);
	
		 Scanner in=new Scanner(System.in);
		
		System.out.println("Is Home Pack up! YES   NO  ");
		String Packup=in.next();
		
	
		if(userchoice==1)
			 Normal_pizza+=1;
		else
			 Dulex_pizza+=1;
    	
		datainsert data1 = new datainsert();
		data1.Packupp(SNO, Normal_pizza, Dulex_pizza,Packup);
		System.out.println("\n Thank you Come again!  ");
	
		in.close();
	
	}}