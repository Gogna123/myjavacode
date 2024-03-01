package Strings_Arrays_Program;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
	 double salary[]=new double[3];
	 salary[0]=75000.10;
	 salary[1]=56000.65;
	 salary[2]=88000.90;
	 Arrays.sort(salary);
	 System.out.println(Arrays.toString(salary));
	 
	 
	 boolean value[]=new boolean[3];
	 value[0]=true;
	 value[1]=false;
	 value[2]=true;
	 System.out.println(Arrays.toString(value));

	}

}
