package Interview_Programms;

public class SwappingVariable_WithExtraVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int c=b;
		b=a;
		a=c;
	
		System.out.println("value of (a)varible got swapped with b :"+a );
		System.out.println("value of (b)varible got swapped with a :"+b);

	}

}
