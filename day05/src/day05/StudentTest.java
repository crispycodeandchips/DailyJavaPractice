package day05;

class Student
{
	String name;
	String walk() { //누군가가 나를 불러줄 때 동작을 한 다음에 불러준 곳에 아무것도 안 가져갈거야
		System.out.println("걸어갑니다.");
		return "hong gil dong"; // 리턴은 '값' 
	}
	
}

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student s = new Student(); // -> 객체 만듦
		s.name="park";
		System.out.println(s.name);
		String data = s.walk();
		System.out.println(data);
		
	}

}
