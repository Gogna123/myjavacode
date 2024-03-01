package lectures;

public class Finall_Program {
	final static int a=10;// final global variable
	   
	
	static void add() {
		final int a=100; //local variable
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println(a);
		int a=12;//this is local variable for main method
		System.out.println(a);
		add();

	}

}
