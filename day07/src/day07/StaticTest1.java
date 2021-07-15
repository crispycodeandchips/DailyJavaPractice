package day07;

/*
 * 클래스 변수, 정적 변수, static 변수
 * 
 * 선언 : Static 타입 변수;
 * 사용 : 클래스이름.변수
 * 메모리는 클래스 '로딩시' 메서드 영역에 메모리 할당
 * 로딩 시점 : main 클래스를 읽을 
*/
class Static1{
	
	static int num = 10; // 클래스 변수, 정적 변수, static 변수
}

public class StaticTest1 {
	public static void main(String[] args) {
		
		Static1 ins = new Static1();
		Static1 ins2 = new Static1();
		Static1 ins3 = new Static1();
		
		ins.num = 10;
		ins2.num = 100;
		ins3.num = 1000;
		
		System.out.println(ins.num);
		System.out.println(ins2.num);
		System.out.println(ins3.num);
		System.out.println(Static1.num);
	}

}
