import java.util.Scanner;
class marks
{
public static void main (String [] args)
{
float mat,sci,sst,eng,hin,total, per;
Scanner sc = new Scanner (System.in);
System.out.println("enter Math marks");
mat=sc.nextFloat();
System.out.println("enter Science marks");
sci=sc.nextFloat();
System.out.println("enter Social Science marks");
sst=sc.nextFloat();
System.out.println("enter English marks");
eng=sc.nextFloat();
System.out.println("enter Hindi marks");
hin=sc.nextFloat();
total=mat+sci+sst+eng+hin;
per=total/5;
System.out.println("your total marks =" + total);
System.out.println("your total marks in percentage =" + per);
if (per>100)
{
	System.out.println(" hahahahahaha marks overflow");
}
else if (per<=100 && per>=90)
{
	System.out.println("fantastic you have got a good marks ----grade A++ " );
}
else if (per<=90 && per>=80)
{
	System.out.println("fantastic you have got a good marks ----grade A+ " );
}
else if (per<=80 && per>=70)
{
	System.out.println(" you have got a better marks ----grade B " );
}
else if (per<=70 && per>=60)
{
	System.out.println(" you have got a poor marks need to work hard ---- grade C " );
}
else if (per<=60 && per>=40)
{
	System.out.println(" you have got a very poor marks ---- grade D " );
}
   else if(per<39.9)
   {
	System.out.println(" beta baap se bach k rhiyo---- grade fail " );
   }
   else
   {
	   System.out.println(" something error to finding Your marks " );
	   
   }
	





}
}

