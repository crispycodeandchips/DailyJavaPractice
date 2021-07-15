package day06;

class Man {
	String name;
	int age;
	String addr;
//
//	void eat() {
//
//	}
//
//	boolean sleep(int a) {
//
//		return true; // return false;
//	}
//
//	void walk() {
//
//	}
//
//	void talk(int b) {
//
//	}
}

public class ManTest {
	public static void main(String[] args) {

		Man m1 = new Man();
		Man m2 = new Man();
//
//		m1.name = "È«±æµ¿";
//		m1.age = 10;
//		m1.addr = "¼­¿ï";
//
//		m2.name = "È«±æ¼ø";
//		m2.age = 20;
//		m2.addr = "°æ±â";
//
//		System.out.println(m1.name+", "+m1.age+", "+m1.addr);
//		System.out.println(m2.name+", "+m2.age+", "+m2.addr);
		
			m1=m2;
			m1.name = "hong";
			m2.name = "kim";
			
			System.out.println(m1.name);
			System.out.println(m2.name);
			System.out.println(m1==m2);
			
			System.out.println("======");
			System.out.println(m1);
			System.out.println(m2);
			
			Man m3 = new Man();
			System.out.println(m3);
			
			System.out.println("======");
			System.out.println(m1==m2);
			System.out.println(m1==m3);
			
			System.out.println("======");
			System.out.println(m1.equals(m2));
			System.out.println(m1.equals(m3));
	}
}