package InheritencePackage;

public class MethodOverloading { //Assignment 2. Sangeeta gogna
	

	void add(String s) {
		System.out.println("non-static method");
	}
	

	public static void main(String[] args) {
	
		
		MethodOverloading m1=new MethodOverloading();  //invoke a Constructor
		
		m1.add("sangeeta");
	
		
		
	}

}
