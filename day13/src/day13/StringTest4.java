package day13;

public class StringTest4 {
public static void main(String[] args) {
	
	StringBuffer sb = new StringBuffer();
	CharSequence cs = new StringBuilder("hello");
	StringBuffer sb2 = new StringBuffer(cs);
	StringBuffer sb3 = new StringBuffer(new StringBuilder("eee"));
	StringBuffer sb4 = new StringBuffer(10);
	StringBuffer sb5 = new StringBuffer("aaa");
	
	System.out.println(sb.capacity()); // �뷮 // 16
	System.out.println(sb2.capacity()); // 21
	System.out.println(sb3.capacity()); // 19
	System.out.println(sb4.capacity()); // 10
	System.out.println(sb5.capacity()); // 19

	}
}
