package Assignments;

import java.util.Scanner;

public class LocalVariableInScanner {
	
	static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	static void sub(int a,int b) {
		System.out.println(a-b);
	}
	static void mul(int a,int b) {
		System.out.println(a*b);
	}
	static void div(int a,int b) {
		System.out.println(a/b);
	}
	static void mod(int a,int b) {
		System.out.println(a%b);
	}


	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int a, b;
	    a=sc1.nextInt();
		b=sc1.nextInt();
		System.out.println("add of 2 no.");
		add(a,b);
		
		Scanner sc2=new Scanner(System.in);
		int a2, b2;
	    a=sc2.nextInt();
		b=sc2.nextInt();
		System.out.println("sub of 2 no");
		sub(a,b);
		
		Scanner sc3=new Scanner(System.in);
		int a3, b3;
	    a=sc3.nextInt();
		b=sc3.nextInt();
		System.out.println("mul of 2 no");
		mul(a,b);
		
		Scanner sc4=new Scanner(System.in);
		int a4, b4;
	    a=sc4.nextInt();
		b=sc4.nextInt();
		System.out.println("div of 2 no");
		div(a,b);
		
		Scanner sc5=new Scanner(System.in);
		int a5, b5;
	    a=sc5.nextInt();
		b=sc5.nextInt();
		System.out.println("mod of 2 no");
		mod(a,b);
	}

}
