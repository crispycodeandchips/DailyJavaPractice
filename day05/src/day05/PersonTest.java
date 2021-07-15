package day05;

/* java : 객체지향 프로그램 문법 : reference...
 * oracle => 암기
 * 	select * from employees;
 * 	select * (select)
 * 	from
 * 	(
 * 		select rownum as rnum
 * 	)
 * 	where (select)
 * html css js => ...
 * jsp => mvc
 * spring ... @ xml
 * 	=> spring boot
*/

class Person
{
	String name;
	int age;
	String addr;
	
}

public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person(); // 객체
		// p1   reference variable  new Person(): 객체, instance
		
		p1.name = "김명진";
		p1.age = 28;
		p1.addr = "경기";
		Person p2 = new Person();
		p2.name = "송기훈";
		p2.age = 32;
		p2.addr = "서울";
				
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.addr);
		System.out.println("========");
		System.out.println(p2.name);
		System.out.println(p1.age);
		System.out.println(p1.addr
				);
		
		
	}

}
