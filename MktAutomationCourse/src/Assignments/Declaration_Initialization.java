package Assignments;

public class Declaration_Initialization {
     static int age;
     static String name; //global variable declaration
     static int salary;
	public static void main(String[] args) {
		form2();
		applicationform();
		}
	static void applicationform() {
		age=19;
		name="sangeeta";// Initialization of global variable
		salary=54697;
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		}
	static void form2() {
		String name="mohit";//local variable declaration &initialization
		int age=29;
		int salary=89909;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		System.out.println();
		
	}

}
