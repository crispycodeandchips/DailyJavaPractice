package day12;

public class StringTest {
	public static void main(String[] args) {
		
		// public String();
		// public String(String original)
		// public String(char[] value)
			

		
		String a1 = new String();
		String a2 = new String("abcdefg");
		char[] ch =  {'a','b','c','d','e','f','g'};
		String a3 = new String(ch);
		String a4 = new String(new char[] {'a','b','c','d','e','f','g'});
	
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	
		 char ch1 = a3.charAt(0);
         System.out.println(ch1);
         System.out.println(a3.length());
         
        String result = a3.concat("12345");
         System.out.println(result);
         
	}
	
}
