package lectures;
class Parent_Class
{
	 void multiplication(int a,int b)
	{
		System.out.println(a*b);
	}
}
public class Fourteenth_Lecture extends Parent_Class
{
	 void add(int a,int b)
	{
		System.out.println(a+b);
	}
	 void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		Fourteenth_Lecture f1=new Fourteenth_Lecture();
	f1.	add(-74,54);
	f1.	 sub(74,85);
	f1.	 multiplication(12,10);
	}

}
