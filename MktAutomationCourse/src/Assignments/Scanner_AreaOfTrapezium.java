package Assignments;

import java.util.Scanner;

public class Scanner_AreaOfTrapezium {
	
	static final double area=0.5;

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		//area of trapezium= 1/2 *(a+b)*h
		
		System.out.println("enter the value");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int h=s1.nextInt();
		
		System.out.println("Area of trapezium is :" +area*(a+b)*h);
		

	}

}
