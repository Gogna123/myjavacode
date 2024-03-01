package Strings_Arrays_Program;

public class Alpa_Numeric_Present {

	public static void main(String[] args) {
		String s1="mango";
		char[] c1=s1.toCharArray();
		int alphaCount=0;
		int numericCount=0;
		
		for(int i=0; i<=s1.length()-1; i++) {
			
			boolean answer=Character.isAlphabetic(c1[i]);
		
		if(answer==true) {
				alphaCount++;
				
			             }
			else {
				numericCount++;
				}
		
		}
		System.out.println("Alpha count is :"+alphaCount);
		System.out.println("Numeric count is:"+numericCount);
	

}
}