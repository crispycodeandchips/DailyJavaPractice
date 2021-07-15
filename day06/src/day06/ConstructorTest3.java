package day06;

/* 생성자 오버로딩 (Overloading)
 * : 클래스 내에서 (다른 인자의)생성자를 여러개 선언한 것.
 * 
 * 생성자 이름이 같아야
 * 매개변수 타입, 갯수, 순서가 다를때 다른 생성자로 인식
*/
	class Person3{
		String name; // 매개변수
		int age;
		String addr;
		
		Person3(String name, int age, String addr){
			this.name = name; // 지역변수 // this: 참조변수 this
			this.age = age;
			this.addr = addr; //자신의 객체를 가르킬 때 this를 사용.
		}
		
		// 이름과 나이를 초기화 할 생성자를 작성하시오
		Person3(String name, int age){ // 생성자
			this.name = name;
			this.age = age;
		}
		
		// 이름과 주소를 초기화 할 생성자를 작성하시오.
		Person3(String name, String addr){ // 생성자
			this.name = name;
			this.addr = addr;
		}
		
		// 출력 메서드
		void print() {
			System.out.println("이름: "+name);
			System.out.println("나이: "+age);
			System.out.println("주소: "+addr);
		}
	}

public class ConstructorTest3 {

	public static void main(String[] args) {
	
		Person3 ins = new Person3("hong", 20, "seoul");
		ins.print();

	}

}
