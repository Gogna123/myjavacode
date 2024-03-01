package InheritencePackage;

public class Thiss_Kiyword_Usage {
	
	static String name;
	static double salary;
	static int age; //declaration of global variable
	
	 void form() {
		int age=19;
		double salary=88956.34;//local variable
		String name="sangeeta";
		
		this.age=age;
		this.name=name; //assigning LV values to the GV by
		this.salary=salary;//using this keyword
		}
        public static void main(String[] args) {
		Thiss_Kiyword_Usage t1=new Thiss_Kiyword_Usage();
		t1.form();
		
	System.out.println(name);
	System.out.println(salary);
	System.out.println(age);

		
		
		

	}

}
