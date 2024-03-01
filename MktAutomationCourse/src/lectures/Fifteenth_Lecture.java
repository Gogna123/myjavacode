package lectures;

          class Sangeeta{
	void add() {
		System.out.println("add 2 no.s");
	}
	
	void sub() {
		System.out.println("sub 2 no.s");
	}
	
	
}

      class Parent extends Sangeeta{
	 void mul() {
		 System.out.println("mul 2 no.s");
	 }
	 
	 void div() {
		 System.out.println("div 2 no.s");
	 }
	
}

        public class Fifteenth_Lecture extends Parent {
	
	void mod() {
		System.out.println("mod of 2 no.s");
	}

	public static void main(String[] args) {
		
		 Fifteenth_Lecture f1=new  Fifteenth_Lecture();
		 f1.add();
		 f1.sub();
		 f1.mul();
		 f1.div();
		 f1.mod();

	}

}
