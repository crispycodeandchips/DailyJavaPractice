package day06;

class Person4{
	
	String name; // 멤버변수(클래스 안에 있어요) // 필드
	int age;
	String addr;
	String phone;
	
	Person4(String name, int age, String addr, String phone) {
		//this(name, age, addr);
		//this.phone = phone;
		this(name, age, addr);
		this.phone = phone;
		System.out.println("Person4-name, age, adr, phone");
	}
	
	Person4(String name, int age, String addr) {
		this(name, age);
		this.addr = addr;
		//this.name = name;
		//this.age = age;
		this.addr = addr;
		//System.out.println("생성자 - 매개변수 3");
		
	}
	
	Person4(String name, int age) {
		this(name);
		this.age = age;
	}
	
	Person4(String name) {
		this.name = name;
	}
	
	// 멤버 변수를 출력하는 메서드
	void print() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("addr: "+addr);
		System.out.println("phone: "+phone);
	}
}

public class ConstructorTest4 {
	public static void main(String[] args) {
		
		Person4 ins = new Person4("hong", 20, "seoul", "1111");
		ins.print();
		
	}

}
