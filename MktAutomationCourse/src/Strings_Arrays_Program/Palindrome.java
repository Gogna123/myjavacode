package Strings_Arrays_Program;

public class Palindrome {

	public static void main(String[] args) {
		String s1="mom";
		String reverse="";
		
		for(int i=s1.length()-1; i>=0; i--) 
		{
			char c=s1.charAt(i);
			reverse=reverse+c;
			System.out.println(c);
		}
		
		if(s1==reverse) {
			System.out.println("yes it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
	}

}
