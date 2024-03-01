package InheritencePackage;

class Super_Man{
	Super_Man(){
		System.out.println("im parent class constructor");
	}
}

public class Super_Calling_Statement extends Super_Man {
	Super_Calling_Statement(){
		super();
		System.out.println("im child class constructor");
		
	}

	public static void main(String[] args) {
		Super_Calling_Statement s1=new Super_Calling_Statement();
		
	}

}
