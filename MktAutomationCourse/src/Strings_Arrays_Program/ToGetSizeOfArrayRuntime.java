package Strings_Arrays_Program;

import java.util.Arrays;
import java.util.Scanner;

public class ToGetSizeOfArrayRuntime {

	public static void main(String[] args) {
		int rank[]=new int[3];
		Scanner s1=new Scanner(System.in);
		
		for(int i=0; i<3;i++) {
			
			rank[i]=s1.nextInt();
			
			
		}
		Arrays.sort(rank);
		System.out.println(Arrays.toString(rank));//size of array

	}

}
