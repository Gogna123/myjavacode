package lectures;
public class Twentieth_Lecture 
{

	public static void main(String[] args) 
	{
		String name="Manish KUmar Tiwari";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			char answer=		name.charAt(i);
	
				reverse=reverse+answer;
		}
		System.out.println(reverse);
		boolean a1=	name.equals(reverse);//radar
		System.out.println(a1);
		
		if(a1==true)
		{
			System.out.println("the input is palindrome");
		}
		else
		{
			System.out.println("they are not palindorme");
		}
//mom
//dad
//radar
//maam
//madam
		
	}

}
