package lectures;
abstract class Third_Class //abstadct class
{
	abstract void thirdmethod();
	abstract void forthmethod();
	void add1() //by vreating an object and with help of reverence variable
	{
		System.out.println("1");
	}
	static void add2() //directly by uts name
	{
		System.out.println("2");
	}
}
abstract class Second_Class extends Third_Class
{
	abstract void secondmethod(); //by vreating an object and with help of reverence variable
	
	abstract void second_ethod(); //by vreating an object and with help of reverence variable

	void add3()//by vreating an object and with help of re
	{
		System.out.println("addition");
	}
	void add4()//by vreating an object and with help of re
	{
		System.out.println("adding 2 no.s");
	}
}
public class seventeenth_Lecture extends Second_Class
{
	void subtraction() //by vreating an object and with help of re
	{
		System.out.println("sub of 2 no.s");
	}
	void multiplication()//by vreating an object and with help of re
	{
		System.out.println("multiply of 2 no.s");
	}
	public static void main(String[] args) 
	{
		seventeenth_Lecture s1=new seventeenth_Lecture();
		add2() ;
	}
	void secondmethod() {
		System.out.println("Developwe will write here intern logic");
	}
	void second_ethod() {
		System.out.println("Developwe will write here intern logic");
		
	}
	void thirdmethod() {
		System.out.println("Developwe will write here intern logic");
		
	}
	void forthmethod() {
		System.out.println("Developwe will write here intern logic");
		
	}

}
