package day07;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(0, null);
		// p1.name = "hong"; //name�� private�̶� �� �޾ƿ�. // set �޼���
		// ->
		p1.setName("hong");

		// System.out.println(p1.name); // get �޼���
		// ->
		System.out.println(p1.getName());
	}
}
