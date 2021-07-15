package day13;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		sb.append("hong gil dong");
		sb.append("hello");
		System.out.println(sb);
		System.out.println("=================");
		StringBuilder sb2 = new StringBuilder("abc");
		
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		
		sb2.append("1234567890123456789");
		
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		
		System.out.println(sb2);
		
		sb2.delete(2, 5);
		System.out.println(sb2);
		
		
		// append는 뒤에다 추가, insert는 가운데도 추가 가능
		sb2.insert(2, "hello");
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		
		System.out.println(sb2.capacity());
		sb2.trimToSize();
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
	}

}
