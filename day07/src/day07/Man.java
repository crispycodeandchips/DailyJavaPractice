package day07;

/*   
 * 메서드 오버로딩(method overloading) 
 *  클래스 내에서  이름이 같은 메서드를 여러개 정의할 수 있다. 
 *  => 메서드 이름이 같으나 매개변수의 타입, 순서, 갯수가 다를 때 다른 메서드로 인식!!
 *      단, 리턴타입과는 상관없음
 */

public class Man {

	private String name;
	private int age;
	private String addr;
	private String phone;

	// name과 age를 변경하는 메서드
	public void modify(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// name과 addr을 출력하는 메서드
	public void modify(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
	}

	// name과 phone을 출력하는 메서드

	// Duplicate method prt(String, String) in type Man

//	
//	 public string prt(String name, String addr) { 
// 	  return "hong"; 
//	}
	
//	 public void prt(String name, String addr) { 
//  
//	}
//	 
}
