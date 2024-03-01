package TypeCasting;
class Teacher{
	void add() {
		System.out.println("add");
	}
	
	
}
class Mentor extends Teacher{
	void sub() {
		System.out.println("sub");
	}
	
	
}

public class Student1 extends Mentor{ //upcasting

	public static void main(String[] args) {
		Mentor m1=new Student1();
		m1.add();
		m1.sub();
		System.out.println("after downcasting");
		
		//downcasting
		Student1 s1=(Student1)m1;
		s1.add();
		s1.mul();
		s1.sub();
		
	}
      void mul() {
    	  System.out.println("mul");
      }
}
