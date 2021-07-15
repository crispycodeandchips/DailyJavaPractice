package day08;

class Super3 {
	
	public Super3() {
		System.out.println("super3 constructor");
	}
	
}

class Sub3 extends Super3 {
	
	public Sub3()
	{
		super();
		System.out.println("sub3 constructor");
	}
	
}

public class SuperSubTest3 {
	public static void main(String[] args) {
	
		Super3 ins = new Super3();
		System.out.println("========");
		
		Sub3 ins2 = new Sub3(); // 이미 상속받은 클래스이기 때문에 호출하면 동시에 부모의 생성자까지 자동 호출됨.
		
	}
}
