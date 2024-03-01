package Assignments;

import java.util.Scanner;

public class Scanner_CircumfrenceOfRectangle {
	static final int peri=2;

	public static void main(String[] args) {
		//circum of rectangle= 2l+2w
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the values");
		int l=s1.nextInt();
		int w=s1.nextInt();
System.out.println("circumfrnce of rectangle :"+ peri*l+peri*w);
		
		

	}

}
