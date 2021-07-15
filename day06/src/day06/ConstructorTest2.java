package day06;

/*
 * 생성자 : 객체를 만드는 애 (constructor)
 * 
 * 생성자 만드는 방법
 * 	클래스 이름과 동일한 이름의 메서드 모양, 단 리턴타입이 없어야 함.
 * 
 * 호출 시점 :
 * 	new 할 때 자동으로 호출
 * 
 * 사용 이유 :
 * 	객체의 인스턴스 변수들을 초기화 하기 위해
 * 	객체가 만들어지면서 해야 할 기술..
*/

class Student2 {
	// 객체를 만들기 위해서는 반드시 생성자가 필요하다.
	// 객체가 만들어진 다음 반드시 해야 할 것은 생성자에 써주면 됨.
	
	Student2(int num1) {
		System.out.println("생성자 호출:"+num1);
	}
	Student2(){
		System.out.println("생성자 -no arguement 생성자"); //arguement : 매개변수
	}
	Student2(String name){
		System.out.println("생성자 -매개변수가 String 타입");
	}
}
public class ConstructorTest2 {

	public static void main(String[] args) {
	
		Student2 ins = new Student2(10);
		Student2 ins2 = new Student2();
		Student2 ins3 = new Student2("hong");

	}

}
