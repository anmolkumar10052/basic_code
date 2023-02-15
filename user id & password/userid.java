import java.util.Scanner;
class userid
{
	public static void main (String[] args)
	{
		String uid, upass;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your user id:");
		uid=sc.next();
		System.out.println("enter your password");
		upass=sc.next();
		if (uid.equals("anmol_aaditya") && upass.equals("anmol_aaditya"))
		{
			System.out.println(" welcome to Coachup Classes");
		}
		else if (!uid.equals("anmol_aaditya") && upass.equals("anmol_aaditya"))
		{
			System.out.println("wrong userid ");
		}
		else if (uid.equals("anmol_aaditya") && !upass.equals("anmol_aaditya"))
		{
			System.out.println("wrong password ");
		}
		else
		{
			System.out.println("Both userid and password are wrong");
		}
		
		
		
		
		
	}
}