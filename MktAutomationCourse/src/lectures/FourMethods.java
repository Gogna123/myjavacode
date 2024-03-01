package lectures;

public class FourMethods {
	 FourMethods(){
		System.out.println("im constructor");
	}
	
	static void add1() {
		System.out.println("static method 1");
	}
	static void add2() {
		System.out.println("static method 2");
	}
	static void add3() {
		System.out.println("static method 3");
	}
	static void add4() {
		System.out.println("static method 4");
	}
	public static void main(String[] args) {
	    add1();
	    add2();
	    add3();
	    add4();
	    
	    FourMethods f1=new FourMethods(); //invoke a Constructor
	    System.out.println("");
	    f1.sub1();
	    f1.sub2();
	    f1.sub3();
	    f1.sub4();
	   
	    

	}
	 void sub1() {
		System.out.println("non-static method 1");
	}
	 void sub2() {
			System.out.println("non-static method 2");
		}
	 void sub3() {
			System.out.println("non-static method 3");
		}
	 void sub4() {
			System.out.println("non-static method 4");
		}

}
