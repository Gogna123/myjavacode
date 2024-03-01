package Strings_Arrays_Program;

import java.util.Arrays;

public class Copy_Array_Values {

	public static void main(String[] args) {
		int age[]=new int[4];
		age[0]=12;
		age[1]=14;
		age[2]=16;
		age[3]=18;
		
		int value[]=new int[4];
		
		for(int i=0; i<4;i++) {
			value[i]=age[i];
		}
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(value));
	
		
		

	}

}
