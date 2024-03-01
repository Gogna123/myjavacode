package Assignments;

import java.util.Scanner;

public class Scanner_AreaOfSquare {
	
	

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("enter the value of side1");
		int side1=s1.nextInt();
		
		System.out.println("enter the value of side2");
		int side2=s1.nextInt();
		
		System.out.println("area of square is :" +side1*side2);
		
		
	}

}
