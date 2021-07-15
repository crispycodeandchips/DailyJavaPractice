package day07;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(0, null);
		// p1.name = "hong"; //name이 private이라 못 받아옴. // set 메서드
		// ->
		p1.setName("hong");

		// System.out.println(p1.name); // get 메서드
		// ->
		System.out.println(p1.getName());
	}
}
