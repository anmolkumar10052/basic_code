import java.util.Scanner;
class ptrn
{
	public static void main(String [] args)
	{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter row to get pattern:");
	a=sc.nextInt();
	System.out.println("enter column to get pattern");
	b=sc.nextInt();
	for(int i=1;i<=a;i++)
	{
		for(int j=1;j<=b;j++)
		{
			if (i==1 || i==a || j==1 || j==b)
			{
				System.out.print("*");
			}
			else
	System.out.print(" ");
	

		}
		System.out.println("");
	}
	
	}
}
	