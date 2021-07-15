package day09;

	// final 변수 : 상수 - 지역변수, 인스턴스 변수, 클래스 변수에 대해 정리...
	// final 메서드 : 오버라이딩 불가
	// final 클래스 : 상속불가 (최종적인), 종단 클래스

class Final1 {
public void prt() {
	System.out.println("final1 prt method");
}

}

class SubFinal1 extends Final1 {
	
	@Override
	public void prt() { // 재정의 : 상속관계에서 부모에서 정의된 메서드를 자식클래스에서 다시 정의
		System.out.println("SubFinal1");
	}
}

public class FinalTest1 {
	public static void main(String[] args) {
		
	}
}