package day14;

class Person{
	public void prt()
	{
		System.out.println("Person class prt method!!!");
	}
}
public class ClassTest {
	public static void main(String[] args) {
		try {
		Class c = Class.forName("day14.Person");
		Person p = (Person)c.newInstance(); // reflection ±â¹ý
		p.prt();
				
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
