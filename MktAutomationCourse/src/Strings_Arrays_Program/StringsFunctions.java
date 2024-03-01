package Strings_Arrays_Program;

public class StringsFunctions {

	public static void main(String[] args) {
		

       
         
		String s1="Sangeeta Gogna";
		
		char a1=s1.charAt(4);
          System.out.println(a1);
          
         boolean b= s1.contains("gogna");
         System.out.println(b);
         
         int c=s1.length();
         System.out.println(c);
         
         String d=s1.toUpperCase();
         System.out.println(d);
         
         String e=s1.toLowerCase();
         System.out.println(e);
         
         int f=s1.indexOf('n');
         System.out.println(f);
         
        String g= s1.trim();
        System.out.println(g);
        
       String h= s1.concat(" Mohit").concat(" Gogna");
       System.out.println(h);
       
      boolean i= s1.endsWith("a");
       System.out.println(i);
       
       String j=s1.replace('a', 's');
       System.out.println(j);
       
      String k= s1.replaceAll("Gogna", "Singh");
      System.out.println(k);
      
     System.out.println(( s1.replaceAll("[0-9]", "")));
     System.out.println((s1.replaceAll("[A-Z]", "")));
     
     String s2="";
     boolean l=s2.isEmpty();
        System.out.println(l);
        
	}

}
