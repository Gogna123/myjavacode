package lectures;
public class Lecture_24
{
	public static void main(String args[]) 
	{
		String name="ram tiwari";
		char[] c1=	name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
		boolean answer=	Character.isSpaceChar(c1[i]);
			
			if(answer==true)
			{
				System.out.println("There is a space in the given string"+ " The index of space is "+i);
			}
			
		}	
		
			
	}

}
