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
		// t1, t2 �� �����ؾ� ��
		t1(); // �޼ҵ� �ȿ����� �׳� �޼ҵ带 ȣ���ϸ� ��
		t2();
	}
}
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.t1(); // �޼ҵ� �ٱ������� ��������.�޼ҵ� ������� ȣ��.
		p1.t2();
		System.out.println("======");
		p1.t3();
	}
}
