package day14;

import java.io.IOException;

import javax.management.modelmbean.XMLParseException;

/*
 * 메서드 오버라이딩
 * 상속관계에서 부모 클래스에서 정의한 메서드를 자식 클래스에서 다시 정의(재정의)
 * 
 * 부모에서 정의한 메서드의 이름, 매개변수 타입, 순서, 갯수가 같고, 리턴타입도 같아야 함(메서드 시그니쳐가 같아야 함)
 * 접근지정자 같거나 넓어야
 * 예외는 같거나 적어야
*/

class A1 {
	
	void prt() throws IOException, XMLParseException {
		System.out.println("prt");
	}
}

class A2 extends A1 {

	@Override
	public void prt() throws Exception {

	}
	public class OverrideTest {

	}
}
