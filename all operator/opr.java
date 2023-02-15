import java.util.Scanner;
class opr
{
	public static void main (String[] args)
	{
		int a=10 , b=15;
		int in , c ,d ,e,f ,g;
		Scanner sc=new Scanner (System.in);
		System.out.println("hey smiley @%@ please select your option");
		System.out.println(" #############################################################################");
		System.out.println("##            press 1 for arithmetic operator                               ##");
		System.out.println("##            press 2 for relational operator                               ## ");
		System.out.println("##            press 3 for increament decreament operator                    ##");
		System.out.println("##            press 4 for assignment operator                               ##");
		System.out.println("##            press 5 for logical operator                                  ##");
		System.out.println("##            press 6 for bitwise operator                                  ##");
		System.out.println("##            press 7 for ternary operator                                  ## ");
		System.out.println("##            press 8 for exit                                              ##");
		System.out.println(" #############################################################################");
		Scanner sca =new Scanner (System.in);
		in=sca.nextInt();
		switch(in)
		{
			case 1 : // arithmetic operator
			c=a+b;
			d=a-b;
			e=a/b;
			f=a*b;
			g=a%b;
			System.out.println("a+b=" + c);
			System.out.println("a-b=" + d);
			System.out.println("a/b=" + e);
			System.out.println("a*b=" + f);
			System.out.println("a%b=" + g);
			break;
			case 2: // relational operator
			
			
			
			System.out.println(a +"" + ""  +  b + "=" + b + "is greater" );
			System.out.println(a + "" +"" + b + "=" + a + "is smaller" );
			break;
			case 3: // increament decreament operator
			System.out.println("the value of a =" +a);
			++a;
			System.out.println("the value of a after increament--" +a);
			--a;
			System.out.println("the value of a after decreament--" +a);
			break;
			case 4: // assignment operator
			System.out.println("the value of a =" + a);
			a=155;
			System.out.println("the value of a after assignment 155 =" + a);
			break;
			case 5 : // logical operator
			System.out.println("a&&b" + (a>b&&a<b));
			System.out.println("a||b" + (a>b||b>a));
			System.out.println("a!b" + (a!=b));
			break;
			
			case 6 : // bitwise operator
			System.out.println("a&b=" + (a&b));
			System.out.println("a|b=" + (a|b));
			System.out.println("a^b=" + (a^b));
			System.out.println("~a=" + ~a);
			System.out.println("a>>2" + (a>>2));
			System.out.println("b<<2" + (b<<2));
			break;
			case 8 :
			System.out.println("have a nice day");
			break;
			default:
			System.out.println("enter right option");
			break;
			
			
			
			
			
		}
		
}
}
		