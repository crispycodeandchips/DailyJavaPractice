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
		
		Sub3 ins2 = new Sub3(); // �̹� ��ӹ��� Ŭ�����̱� ������ ȣ���ϸ� ���ÿ� �θ��� �����ڱ��� �ڵ� ȣ���.
		
	}
}
