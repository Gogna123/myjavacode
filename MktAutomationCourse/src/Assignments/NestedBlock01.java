package Assignments;

public class NestedBlock01 {

	public static void main(String[] args) {
		
		int age=19;
		String gender="male";
		
		if(gender=="male") {
			
			if(age>18) {
				System.out.println("person is eligible to vote");
			}
			else {
				System.out.println("person is not eligible to vote");
			}
		}
		
		
		else {
			if(gender=="female") {
				if(age>18) {
					System.out.println("person is eligible to vote");
				}
				else {
					System.out.println("person is not eligible to vote");
				}
			}
		}

	}

}
