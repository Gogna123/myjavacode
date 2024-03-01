package Assignments;

import java.util.Date;

public class Future_TimeProgram {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());//epoch time
		Date d2=new Date(d1.getTime());
		System.out.println(d2);//current time
		//next 10 days time
		Date d3=new Date(d1.getTime()+(1000*60*60*24*10));
		System.out.println(d3);
		
		//pervious last 10 days time
		Date d4=new Date(d1.getTime()-(1000*60*60*24*10));
		System.out.println(d4);
		
		}

}
