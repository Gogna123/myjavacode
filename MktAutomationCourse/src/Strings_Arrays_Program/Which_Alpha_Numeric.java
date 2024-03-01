package Strings_Arrays_Program;

import java.util.Arrays;

public class Which_Alpha_Numeric {

	public static void main(String[] args) {
		String s1="mango123";
		char c1[]=s1.toCharArray();
		
		for(int i=0; i<s1.length(); i++) {
		
		boolean answer=Character.isAlphabetic(c1[i]);
		
		if(answer==true) {
		System.out.println( "index position "+ i + " is " +" Alpha");
		}
		else {
		System.out.println("index position "+ i + " is " + " numeric");	
		}
		}
		

	}

}
