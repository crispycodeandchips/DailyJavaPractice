package day13;

public class StringTest1 {
	public static void main(String[] args) {
		
		String name = "hong";
		String name2 = "hong";
		String name3 = new String("hong");
		
		System.out.println(name==name2);
		System.out.println(name==name3);
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name3));
	}

}
