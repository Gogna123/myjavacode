package Interview_Programms;

public class Arrays_FindThe_Average {

	public static void main(String[] args) {
		int avg[]=new int[5];
		avg[0]=10;
		avg[1]=20;
		avg[2]=30;
		avg[3]=40;
		avg[4]=50;
		
		
		int sum=0;
		
		for(int i=0; i<avg.length; i++) {
			//System.out.println(avg[i]);
			
			sum=sum+avg[i];
		}
       
		System.out.println(sum/avg.length);
	}

}
