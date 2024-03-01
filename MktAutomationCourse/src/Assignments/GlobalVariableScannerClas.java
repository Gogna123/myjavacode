package Assignments;

import java.util.Scanner;

public class GlobalVariableScannerClas {
	
	static int num1;
	static int num2;
	
  static void add() {
	 System.out.println(num1+num2);
 }
  static void sub() {
		 System.out.println(num1-num2);
	 }
  static void mul() {
		 System.out.println(num1*num2);
	 }
  static void div() {
		 System.out.println(num1/num2);
	 }
  static void mod() {
		 System.out.println(num1%num2);
	 }

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		
		 num1=s1.nextInt();
		 num2=s1.nextInt();
		 
		 System.out.println("addition of two numbers");
		 add();
		
		System.out.println("subtraction of 2 no.s");
		sub();
		
		System.out.println("multiply of 2 no.s");
		mul();
		
		System.out.println("div of 2 no.s");
		div();
		
		System.out.println("mod of 2 no.s");
		mod();
		
	
	}
	
	

}
