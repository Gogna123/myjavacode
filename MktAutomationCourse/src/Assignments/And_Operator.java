package Assignments;

public class And_Operator {

	public static void main(String[] args) {
		
		String order="tea";
		String s1="water";
		String s2="water";
		
		if(!(order=="tea" && s1==s2)) {
			System.out.println("both conditions are true");
		}
		else {
			System.out.println("one of the condition is false");
		}
		
	}

}
