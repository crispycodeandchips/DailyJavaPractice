package day05;

/* java : ��ü���� ���α׷� ���� : reference...
 * oracle => �ϱ�
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
		
		Person p1 = new Person(); // ��ü
		// p1   reference variable  new Person(): ��ü, instance
		
		p1.name = "�����";
		p1.age = 28;
		p1.addr = "���";
		Person p2 = new Person();
		p2.name = "�۱���";
		p2.age = 32;
		p2.addr = "����";
				
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
