package day07;

class Person2 {
	
//	void prt(String name) {
//		System.out.println(name);
//	}
//	
//	void prt(String name, String addr) {
//		System.out.println(name);
//		System.out.println(addr);
//	}
//	
//	void prt(String name, String addr, String postCode) {
//		System.out.println(name);
//		System.out.println(addr);
//		System.out.println(postCode);
//	}
	
	void prt(String...items) {
		for(String item:items)
			System.out.println(item);
		
	}
}
public class ArgueTest {
	public static void main(String[] args) {
		Person2 ins = new Person2();
		ins.prt("hong");
		System.out.println("====");
		ins.prt("hong", "seoul");
		System.out.println("=====");
		ins.prt("hong","seoul", "111");
		System.out.println("=====");
		ins.prt("hong","seoul","111","13555");
	}
	
}
