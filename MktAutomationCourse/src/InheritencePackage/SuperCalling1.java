package InheritencePackage;

public class SuperCalling1 extends SuperCalling2 {
	
	SuperCalling1(){
		super(10,"sangeeta");
		System.out.println("im constructor of child class");
	}

	public static void main(String[] args) {
		
		new SuperCalling1();
		

	}

}
