package Interview_Programms;

import java.util.Scanner;

public class Find_Factorial {

	public static void main(String[] args) {
	     
		 Scanner s1=new Scanner(System.in);
	     int a=s1.nextInt();
	     int factorial=1;
	    		 
	     
	     for(int i=a; i>=1; i--) {
	    	 factorial=factorial*i;
	     }
	     System.out.println(factorial);
            
	     
	}

}
