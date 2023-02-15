import java.util.Scanner;
class useridloop
{
	public static void main (String[] args)
	{
       String userid,pass;
	   Scanner sc= new Scanner(System.in);
	   System.out.println("enter your userid : ");
	   userid=sc.next();
	   System.out.println("enter your password : ");
	   pass=sc.next();
	   
	   int j=0;
	   while (j<5)
	   {
		   if (userid.equals("anmol") && pass.equals("12345"))
		   {
			   System.out.println("welcome in my program");
		   
		   else if (!userid.equals("anmol"))
		   {
		   System.out.println("wrong userid");
		   } 
		   }
	   }
            for(int i=5;i>0;i++)
			{				
           else if (!pass.equals("12345")
		   {
			   System.out.println("please enter correct password" + i  + "attempts left");
		   }			   
			}
	}
}
	