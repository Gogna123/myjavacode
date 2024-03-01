package Assignments;

import java.util.Scanner;

public class Scanner_AreaOfTriangle {
	
	static final double tri=0.5;

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("enter the value of base");
		int b=s1.nextInt();
		
		System.out.println("enter the value of height");
		int h=s1.nextInt();
		
		System.out.println( "arae of trinagle is :"+tri*b*h);
	}

}
