package Assignments;

import java.util.Scanner;

public class Scanner_AreaOfCircle {
	
	static final double pie=3.14;
	
	
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("enter the radius value");
		
		double r=s1.nextDouble();
		 System.out.println(pie*r*r);
            
	}

}
