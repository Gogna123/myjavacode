package InheritencePackage;

class Parent{
 final void add(int a) {
		System.out.println("im method of parent class");
	}
	void sub() {
		System.out.println("2nd method of parent class");
	}
}

public class MethodOverRiding extends Parent {
   void add() {
	   //super.add(10);
	  //super.sub();
	 System.out.println("im method of child class");
   }
 void sub() {
		 System.out.println("2nd method of child class");
	   }
	public static void main(String[] args) {
		MethodOverRiding m1=new MethodOverRiding();
		m1.add();
		m1.sub();
		
		
	}

}
