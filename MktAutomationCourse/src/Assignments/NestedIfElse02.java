package Assignments;

public class NestedIfElse02 {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		
		if(a<b) {
			if(b<c) {
				System.out.println("1");
			}
			else {
				System.out.println("2");
			}
		}
		
		else {
			System.out.println("3");
		}
		
	}
}

