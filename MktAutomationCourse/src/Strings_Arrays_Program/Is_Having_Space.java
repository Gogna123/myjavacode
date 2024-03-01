package Strings_Arrays_Program;

public class Is_Having_Space {

	public static void main(String[] args) {
		String s1="sangeeta 123";
		char c1[]=s1.toCharArray();
		for(int i=0; i<s1.length();i++) {
			
			boolean answer=Character.isSpaceChar(c1[i]);
			if(answer==true) {
				System.out.println("is having space");
			}
			
			
		}
		
		

	}

}
