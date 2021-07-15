package day07;

/* 클래스 메서드 : 정적 메서드, static 메서드
 * 메서드 이름 앞에 static을 붙임
 * static void prt()
 * {
 * 
 * }
 * 사용방법 : 클래스이름.메서드();
 * 
 * 클래스 메서드에 사용할 수 있는 변수
 * 지역변수( => 매개변수 포함), 클래스변수는 사용 가능하지만
 * 인스턴스 변수는 사용 안됨!
*/
class Static2 {
	int age; // 멤버변수, 인스턴스 변수
	static String addr = "seoul"; // 클래스변수
	public static void prt(int num) { // 클래스 메서드 // 지역변수
		String name = "hong"; // 지역변수
		System.out.println("prt!!!");
		System.out.println(addr);
//		System.out.println(age); // 인스턴스변수라 못씀!
	}
}

public class StaticTest2 {
	public static void main(String[] args) {

		Static2.prt(10);
	}
}
