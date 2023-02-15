import java.util.Scanner;
class useridloop1
{
	public static void main (String[] args)
	{
       String userid,pass;
	   Scanner sc= new Scanner(System.in);
	   System.out.println("enter your userid : ");
	   userid=sc.next();
	   //System.out.println("enter your password : ");
	   //pass=sc.next();
	   
	   
	   
		   if (userid.equals("anmol"))
		   {
			   System.out.println("fantastic! now enter your password");
			   
		   }
		   
		  if(!userid.equals("anmol"))
		  {
			  for(int i=0;i<3;i++)
			  {
				  System.out.println("wrong userid ----enter your userid again");
				  userid=sc.next();
				  if(userid.equals("anmol"))
				  {
					  break;
				  }
				  
				  if(i==2)
				  {
					   System.out.println("you haven't the user id -- please come back after 30 min with correct userid:");
					  System.exit(0);
				  }
				  
			  }
				  
	      }
		   System.out.println("enter your password : ");
	       pass=sc.next();
		    if (pass.equals("anmol"))
		   {
			   System.out.println("fantastic! now you can access the code of ANMOL AADITYA :");
			   
		   }
		   
		  if(!pass.equals("anmol"))
		  {
			  for(int j=3;j>0;j--)
			  {
				  System.out.println("wrong password ----enter your password again " + j + " attempts left :");
				  pass=sc.next();
				   if(pass.equals("anmol"))
				   {
					 System.out.println("fantastic! now you can access the code of ANMOL AADITYA :");
					//System.exit(0);
					 break;
				   }
				   
				  if(j==1)
				  {
				 System.out.println("you haven't password ---you can not access the code of ANMOL AADITYA ");
				  System.out.println(" please come back after 30 min with correct password:");
				  break;
				  }
			  }
				  
	      }
		   
}
}