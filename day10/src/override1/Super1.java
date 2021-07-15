package override1;

/* private, default, protected, public
 * 
 * 메서드 오버라이딩
 * 	: 상속관계에서 부모에서 정의된 메서드를 자식 클래스에서 다시 정의한 것(재정의)
 * 
 * 메서드의 이름이 같아야, 매개변수 타입, 순서, 갯수가 같아야, 리턴타입도 같아야( 메서드 시그니처가 같아야)
 * 	접근지정자 : 같거나 넓어야 됨
*/
public class Super1 {

	void prt() {
		System.out.println("Super1-prt method");
	}
}
