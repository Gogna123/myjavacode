package Assignments;

import java.util.Scanner;

public class Scanner_GlobalVarble {
	
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
		Scanner s1=new Scanner(System.in);
		num1=s1.nextInt();
		num2=s1.nextInt();
		add();
		
		num1=s1.nextInt();
		num2=s1.nextInt();
		sub();
		
		num1=s1.nextInt();
		num2=s1.nextInt();
		mul();
		
		num1=s1.nextInt();
		num2=s1.nextInt();
		div();
		
		num1=s1.nextInt();
		num2=s1.nextInt();
		mod();
		
	}

}
