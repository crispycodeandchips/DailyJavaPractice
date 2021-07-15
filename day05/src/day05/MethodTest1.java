package day05;

class Person2 {
	void prt() { // 메소드
		System.out.println("prt method call");
	}

	void draw(String data) {
		System.out.println(data + "를 그립니다");
	}

	void cal(int a, float b, long c, char d, String e)
	// void 리턴 타입
	// cal 메소드 변수명
	// (  ) 메소드 안에 들어갈 변수들의 타입과 이름
	// 리턴타입 메서드 ()
	// a, b, c, d, e, f 매개변수
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
}
	void think(int num, int num2) {
		System.out.println("num1: "+num+", "+num2);
	}
}

public class MethodTest1 {
	public static void main(String[] args) {
		
		Person2 ins = new Person2();
		ins.prt(); // 메소드 호출
		ins.draw("산");
		ins.cal(10,20.2f,30L,'a',"hong");
		
		int data1 = 10;
		int data2 = 20;
		ins.think(data1, data2);
	}

}
