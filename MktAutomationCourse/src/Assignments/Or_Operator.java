package Assignments;

public class Or_Operator {

	public static void main(String[] args) {
		
		int age=19;
		char gender='m';
		
		if(!(age>18 || gender=='m')) {
			System.out.println("eligible to vote");
		}
		
		
		else {
			System.out.println("not eligible to vote");
		}

	}

}
