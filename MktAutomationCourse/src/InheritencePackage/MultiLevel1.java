package InheritencePackage;

public class MultiLevel1 extends MultiLevel_2 {
	void add() {
		System.out.println("adding of 2 numbers");
	}

	public static void main(String[] args) {
		MultiLevel1 m1=new MultiLevel1();
		m1.add();
		m1.sub();
		m1.mul();
		

	}

}
