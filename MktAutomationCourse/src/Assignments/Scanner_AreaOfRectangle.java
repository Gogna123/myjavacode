package Assignments;

import java.util.Scanner;

public class Scanner_AreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("enter the value of width");
		int w=s1.nextInt();
		
		System.out.println("enter the value of height");
		int h=s1.nextInt();
		
		System.out.println("area of rectangle is: "+w*h);
	}

}
