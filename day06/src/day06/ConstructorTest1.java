package day06;

// ������
/*
 * Ŭ���� �̸��� ���� �̸��� �޼��� ���
 * Ŭ���� �̸�() {
 * }
 * ����Ÿ���� ���� �ȵ�!!!
*/

class Student{
	 String name;
	 
	 Student(String n) // ������ : ��ü�� ����� ��(���).  Constructor
	 {
		 name=n;
	 }
	 
}

public class ConstructorTest1 {
 public static void main(String[] args) {
    Student p1=new Student("hong gil dong");
	 System.out.println(p1.name);
	 
}
}