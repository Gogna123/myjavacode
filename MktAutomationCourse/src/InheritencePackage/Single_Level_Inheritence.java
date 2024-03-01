package InheritencePackage;

 class Parent1{
	void add() {
		System.out.println("im method of parent class");
	}
}

public class Single_Level_Inheritence extends Parent1 {
	void sub() {
		System.out.println("im method of child class");
	}

	public static void main(String[] args) {
		
Single_Level_Inheritence s1=new Single_Level_Inheritence();
 s1.add();
 s1.sub();
		

	}

}
