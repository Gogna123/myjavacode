package lectures;
public class Lecture_27
{

	public static void main(String[] args) 
	{
	//converting double into int 
		int a=	(int)		86.06;//narrowing in explicit way
		System.out.println(a);
	//=====================================
		
		double pi=3.14;
		int newpi=(int) pi; //explicit way
		System.out.println(newpi);
		
		double b=87.23;
		int b2=(int) b;
		System.out.println(b2);
		
		//convert int to double
		
		double d1=(double) 23;
		System.out.println(d1); //Explicit
					
		double wt=23;
		System.out.println(wt); //implicit
		
		// convert long into byte
		    long b4=334455667788l;
			byte b5=(byte) 334455667788L;
			System.out.println(b5);
		
		// convert byte into long 
			//long l1=(long) 123;
		  //System.out.println(l1);
	}

}
