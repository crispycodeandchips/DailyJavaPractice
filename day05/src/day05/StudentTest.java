package day05;

class Student
{
	String name;
	String walk() { //�������� ���� �ҷ��� �� ������ �� ������ �ҷ��� ���� �ƹ��͵� �� �������ž�
		System.out.println("�ɾ�ϴ�.");
		return "hong gil dong"; // ������ '��' 
	}
	
}

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s = new Student(); // -> ��ü ����
		s.name="park";
		System.out.println(s.name);
		String data = s.walk();
		System.out.println(data);
		
	}

}
