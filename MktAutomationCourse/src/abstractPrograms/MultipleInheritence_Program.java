package abstractPrograms;
interface Parents1{  //parent-1
 	void add();
	
}
interface Parents2{  //parent-2
	void sub();
}
interface Parents3{ //parent-3
	void mul();
}
interface Parents4{ //parent-4
	void div();
}

public class MultipleInheritence_Program implements Parents1,Parents2,Parents3,Parents4 {

	public static void main(String[] args) {
		MultipleInheritence_Program i1=new MultipleInheritence_Program();
		i1.add();
		i1.sub();
		i1.mul();
		i1.div();
           
	}
public void mul() {
		System.out.println("use for adding numbers");
	}

	public void sub() {
		System.out.println("use for subtracting numbers");
		}

	public void add() {
		System.out.println("use for multiplying numbers");
		
	}
public void div() {
		System.out.println("use for divide numbers");
		
	}

}
