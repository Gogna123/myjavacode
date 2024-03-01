package Interview_Programms;

public class Check_Given_String_Having_Space {

	public static void main(String[] args) {
		String name="sangeeta gogna";
	
		
		for(int i=0; i<name.length(); i++) {
			char c1=name.charAt(i);
			//System.out.println(c1);
			if(c1==' ') {
				System.out.println("your string is having space");
			}
			
			}
		
	}
}
