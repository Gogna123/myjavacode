package TypeCasting;
class Teacher_3{
	void ice() {
		System.out.println("cold");
	}
} 
class Mentor_3 extends Teacher_3{
	void tea() {
		System.out.println("hot");
	}
}
class Exp_Studnts extends Mentor_3{
	void cake() {
		System.out.println("sweet");
	}
}

public class Students_3 extends Exp_Studnts{
     void juice() {
    	 System.out.println("normal");
     }
	public static void main(String[] args) {
		Mentor_3 m1=new Exp_Studnts();
		m1.ice();
		m1.tea();
		
     //for downcasting firstly upcasting is required b/w Students_3 & Exp_Studnts
          Exp_Studnts exp=new Students_3();
		
		//downcasting
		Students_3 s1=(Students_3)exp;
		s1.cake();
		s1.ice();
		s1.juice();
		s1.tea();

	}

}
