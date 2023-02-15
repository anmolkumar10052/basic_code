class annu
{
	public static void main(String args[])
	{
		int a=10;
		long l=152;
		float f=23.25f;
		double d=25.2652 ;
		char c='a';
		String s= "anmol aaditya ";
		System.out.println("int value a= "+ a );
		System.out.println("long value l= "+ l );
		System.out.println("float value f= "+ f );
		System.out.println("double value d= "+ d );
		System.out.println("char value c= "+ c );
		d=f;
		f=l;
		l=a;
		// s=(String)c;
		d=c;
		a=(int)d;
		a=(int)c;
		System.out.println("float :"+ f+ " change into double="+ d  );
		System.out.println("long :"+ l + " change into float="+ f  );
		System.out.println("integer :"+ a + " change into long="+ l  );
		// System.out.println("character :"+ c + "change into string="+ s  );
		System.out.println("character :"+ c+ " change into double="+ d  );
		System.out.println("double :"+ d + " change into integer="+ a  );
		System.out.println("character :"+ c + " change into integer="+ a  );
		
		
		
		
		
	}
}
