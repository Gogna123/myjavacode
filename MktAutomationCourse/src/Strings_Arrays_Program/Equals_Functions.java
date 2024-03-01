package Strings_Arrays_Program;

public class Equals_Functions {

	public static void main(String[] args) {
		/*String s1="sangeeta gogna";
		String s2="sangeeta gogna";
		boolean a1=s1.equals(s2);
          System.out.println(a1);
          
          String s3="mohitgogna"; //reverse the string using char at index
          for(int i=s3.length()-1;i>=0;i--) {
        	  
        	  char a2=s3.charAt(i);
        	 // System.out.print(a2);
        	  System.out.println(a2);
        	
          }*/
          
          String s4="sangeeta";
          String reverse="";
          
          for(int i=s4.length()-1; i>=0; i--) {
        	  char a3= s4.charAt(i);
        	  
        	  reverse=reverse+a3;
        	  System.out.println(a3);
        	  }
         boolean a5=s4.equals(reverse);
         System.out.println(a5);
         
         if(s4.equals(reverse)) {
        	 System.out.println("it is palindrome");
         }
         else {
        	 System.out.println("it is not palindrome");
         }
        
          
	}

}
