package TypeCasting;
class Teacher_0{
	void add() {
		System.out.println("adding  no.");
	}
}
public class Student_0 extends Teacher_0{
        void sub() {
        	System.out.println("subtract");
        }
	public static void main(String[] args) {
	
       Teacher_0 t1=new Student_0();
       t1.add();
       //downcasting
       Student_0 s1=(Student_0)t1;
       s1.add();
       s1.sub();
       
	}

}
