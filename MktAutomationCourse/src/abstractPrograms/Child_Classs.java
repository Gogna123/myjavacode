package abstractPrograms;
interface Parent9{
	void mul();
	void div();
}

abstract class Parent8 implements Parent9{
	abstract void add();
	abstract void sub();
	
}

public class Child_Classs extends Parent8 {

	public static void main(String[] args) {
		Child_Classs c1=new Child_Classs();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
		
		 
	

	}

	
	void add() {
		System.out.println("adding");
		
	}

	void sub() {
	
		System.out.println("subtracting");
	}


	
	public void mul() {
		System.out.println("1");
	}


	
	public void div() {
		System.out.println("2");
		
	}

}
