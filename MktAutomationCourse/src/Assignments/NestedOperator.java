package Assignments;

public class NestedOperator {
	
	static String gender1="male";
	static String gender2="female";
	static int age=19;

	public static void main(String[] args) {
		
		if(gender1=="frmale") {
			if(age>18) {
				System.out.println("male is eligible to vote");
			}
			else {
				System.out.println("male is not eligible for vote");
			}
		}
		
		else {
			if(gender2=="female") {
				if(age>18) {
					System.out.println("female is eligible to vote");
				}
				else {
					System.out.println("female is not eligible to vote");
				}
			}
		
			
		}
		
	}
	
	}

