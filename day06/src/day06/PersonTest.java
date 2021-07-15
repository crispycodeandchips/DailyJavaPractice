package day06;

class Person
{
	void t1() {
		System.out.println("t1");
	}
	void t2() {
		System.out.println("t2");
	}
	void t3() {
		System.out.println("t2");
		// t1, t2 를 동작해야 함
		t1(); // 메소드 안에서는 그냥 메소드를 호출하면 됨
		t2();
	}
}
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.t1(); // 메소드 바깥에서는 참조변수.메소드 방식으로 호출.
		p1.t2();
		System.out.println("======");
		p1.t3();
	}
}
