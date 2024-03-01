package Strings_Arrays_Program;

import java.util.Date;

public class Finding_Time {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
	 Date d2=new Date(d1.getTime()-(1000*60*60*24*2));//bodmas
	  System.out.println(d2);
		//fetch month
		String s1=d2.toString();//converted into string
		   String ans=s1.substring(4, 7);
		   System.out.println(ans);
		 //fetch date
         String ans2=s1.substring(8, 10);
         System.out.println(ans2);
         //fetch year
        //System.out.println(s1.length());
        String ans3=s1.substring(24, 28);
        System.out.println(ans3);
       
        
        //date format DD MM YYYY
        System.out.println(ans2+" "+ ans+" "+ans3);
        System.out.println(ans2+"/ "+ ans+"/ "+ans3);
        System.out.println(ans2+"-"+ ans+"-"+ans3);
	}

}
