package abstractPrograms;
abstract class Parent{
	abstract void add();
	abstract void sub();
}
public class Concrete extends Parent {
	void mul() {
		System.out.println("1");
	}
	static void div() {
		System.out.println("2");
	}
	public static void main(String[] args) {
		Concrete c1=new Concrete();
	    c1.add();
		c1.sub();
	    c1.mul();
		div();
		}
    void add() { //implimetation of abstract methods
		System.out.println("write logic of the method");
		}
	void sub() {
		System.out.println("3");
	}

}
