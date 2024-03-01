package Assignments;

public class Logical {

	public static void main(String[] args) {
		
		// two else if condition
		
		String trafficLight="orange";
		
		if(trafficLight=="green") {
			System.out.println("you can drive");
		}
		
		else if(trafficLight=="red") { //one
			System.out.println("you cannot drive");
		}
		
		else if(trafficLight=="orange") { //two
			System.out.println("clear the road as light change green to red");
		}
		
		else {
			System.out.println("Do whatever you want to do");
		}
		

	}

}
