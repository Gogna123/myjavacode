package lectures;

public class Tenth_Lecture {
	Tenth_Lecture(){
		System.out.println("this is my 1st constructor");
	}
	Tenth_Lecture(int a){
		System.out.println("this is my 2nd constructor");
	}
	Tenth_Lecture(double d){
		System.out.println("this is my 3rd constructor");
	}
	Tenth_Lecture(long e){
		System.out.println("this is my 4th constructor");
	}
	Tenth_Lecture(char f){
		System.out.println("this is my 5th constructor");
	}

	public static void main(String[] args) {
		
		Tenth_Lecture t1=new Tenth_Lecture();
		Tenth_Lecture t2=new Tenth_Lecture(1);
		Tenth_Lecture t3=new Tenth_Lecture(25.4);
		Tenth_Lecture t4=new Tenth_Lecture(888888888l);
		Tenth_Lecture t5=new Tenth_Lecture('A');
		Tenth_Lecture t6=new Tenth_Lecture("India is my country");
		Tenth_Lecture t7=new Tenth_Lecture(10,10.29);
		Tenth_Lecture t8=new Tenth_Lecture('A',"Sangeeta Gogna");
		Tenth_Lecture t9=new Tenth_Lecture(88.22,'M');
		Tenth_Lecture t10=new Tenth_Lecture("Mohit Gogna",55.34);
		
	
	}
	Tenth_Lecture(String g){
		System.out.println("this is my 6th constructor");
	}
	Tenth_Lecture(int a,double d){
		System.out.println("this is my 7th constructor");
	}
	Tenth_Lecture(char c1,String c2){
		System.out.println("this is my 8th constructor");
	}
	Tenth_Lecture(double d1,char d2){
		System.out.println("this is my 9th constructor");
	}
	Tenth_Lecture(String s1,double s2){
		System.out.println("this is my 10th constructor");
	}

}
