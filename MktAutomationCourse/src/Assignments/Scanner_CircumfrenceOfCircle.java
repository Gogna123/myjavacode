package Assignments;

import java.util.Scanner;

public class Scanner_CircumfrenceOfCircle {
	
	static final double pie=3.14;

public static void main(String[] args) {
		//circum of circle= 2*pie*r
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of radius");
		int r=s1.nextInt();
		System.out.println("circumfrnce of circle is :"+ 2*pie*r);
		

	}

}
