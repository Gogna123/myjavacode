package Strings_Arrays_Program;

import java.util.Arrays;

public class Check_Anagram {

	public static void main(String[] args) {
		String s1="thing";
		String s2="night";
		
		int a1=s1.length();
		int a2=s2.length();
		
		if(a1!=a2) {
		System.out.println("given strings are not anagram");
		}
		else {
			char[]b1=s1.toCharArray();
			char[] b2=s2.toCharArray();
			
			Arrays.sort(b1);
			Arrays.sort(b2);
			
			//System.out.println(Arrays.toString(b1));
			//System.out.println(Arrays.toString(b2));
			
			boolean answer=Arrays.equals(b1, b2);
			//System.out.println(answer);
			
			if(answer==true) {
				System.out.println("given string is anagram");
			}
			else {
				System.out.println("it is not anagram");
			}
		}
		

	}

}
