package TypeCasting;

class Teacher_2{
	void selenium() {
		System.out.println("selenium");
	}
	
}
class Mentor_2 extends Teacher_2{
	void java() {
		System.out.println("java");
	}
	
}

public class Students_2 extends Mentor_2 {

	public static void main(String[] args) {
		
		Teacher_2 t1=new Students_2();
		t1.selenium();
		System.out.println("after downcasting");
		System.out.println("");
		//downcasting
		Students_2 s1=(Students_2)t1;
		s1.java();
		s1.manual();
		s1.selenium();
		
	
	

	}
	void manual() {
		System.out.println("manual");
	}

}
