package day08;

/* 메서드 오버라이딩(method overriding) : 재정의
 * 	:상속관계에서 부모에서 선언한 메서드를 자식클래스에서 다시 선언한 것
 * 	메서드 이름이 같아야, 매개변수 타입, 순서, 갯수도 같아야
 * 	리턴타입도 같아야.. => 메서드 시그니쳐 같아야 
 * 
 * 접근지정자 관점
 * Exception 관점
*/

class Parent1 {
	public void prt() {
		System.out.println("prent-prt method");
	}
}

class Child1 extends Parent1 {
	public void draw() {
		System.out.println("Child1-draw");
	}

	@Override // annotation " 어노테이션
	public void prt() // 메서드 오버라이딩(method overriding): 재정의
	{
		System.out.println("hello");
	}
}



public class OverrideTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}
	

}
