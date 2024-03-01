package Strings_Arrays_Program;

import java.util.Arrays;

public class Check_For_Spaces_Numeric_Alpha_Specialcharacter {

	public static void main(String[] args) {
		String s1="sky is 441 !@#";
		int alphacount=0;
		int numericcount=0;
		int spacecount=0;
		int specialchCount;
		
		
		char[] a1=s1.toCharArray();
		
		for(int i=0; i<s1.length(); i++) {
			boolean b1=Character.isAlphabetic(a1[i]);
			boolean b2=Character.isDigit(a1[i]);
			boolean b3=Character.isSpaceChar(a1[i]);
			
			
			if(b1==true) {
				alphacount++;
				
			}
			if(b2==true) {
				numericcount++;
			
			}
			if(b3==true) {
				spacecount++;
			}
			
		}
		
		System.out.println("alpahbets size is "+alphacount);
		System.out.println("numeric size is "+numericcount);
		System.out.println("space size is "+spacecount);
		int stringlenght=s1.length();
      System.out.println(stringlenght-((alphacount+numericcount+spacecount))+ " Special character size");
		
		
		
		
		
	}

}
