package Interview_Programms;

public class Check_Divisible_By_3_5 {

	public static void main(String[] args) {

          for(int i=1; i<1000; i++) {
        	  
        	  if(i%3==0) {
        		  System.out.println(i+ " " +"sun");
        		
        	  }
        	  if(i%5==0) {
        		  System.out.println(i+ " " +"moon");
        	  }
        	  if(i%3==0 && i%5==0) {
        		  System.out.println(i+ " " +"sunmoon");
        	  }
        	  
          }

	}

}
