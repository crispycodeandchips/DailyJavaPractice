package abstract1;

/* 추상클래스는 객체생성을 하지 못하는 클래스
 * 클래스 이름 앞에 abstract
 * abstract class 클래스명{} -> 추상클래스
 * 객체 생성을 위해서는 
*/
abstract class Dog { // 클래스 앞에 abstract를 붙이면 그건 객체를 못 만드는 클래스.
	public void sound() {
		System.out.println("멍멍");
	}

	public void eat() {
		System.out.println("밥을 먹습니다");
	}
	
	public abstract void act(); // 선언만 있고 몸통은 없다. // 추상 메서드
}

class ShihTzu extends Dog {
	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("코를 곤다");
		System.out.println("사람보면 짖는다");
	}
	
}
class GoldenRetriever extends Dog {
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("벽을 부순다");
		System.out.println("쇼파를 뜯는다");
		System.out.println("문을 부순다");
		
	}
	
	
}

public class AbstractTest1 {
	public static void main(String[] args) {
		//Dog ins = new Dog();
		//GoldenRetriever ins = new GoldenRetriever();
		//Dog ins2 = new Dog(); // 객체 못 만듦 
		Dog ins3 = new GoldenRetriever();
		ins3.sound(); // 메서드 호출 모양은 같으나, 결과는 다 다르다.s (다형성)
		ins3.eat(); // 메서드는 Dog 객체의 메서드, 결과는 GR객체의 결과
		ins3.act();
		System.out.println("====================");
		ins3 = new ShihTzu();
		ins3.sound(); // 메서드 호출 모양은 같으나, 결과는 다 다르다. (다형성)
		ins3.eat(); // 메서드는 Dog 객체의 메서드, 결과는 ST객체의 결과
		ins3.act();
		//GoldenRetriever ins4 = new Dog();
	}
}
