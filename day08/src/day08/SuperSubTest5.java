package day08;

class Super5 {
	
	private String name;
	public Super5(String name) {
		this.name = name;
	}
	// public Super5() {} // subclass���� ȣ���� �����ڴ� �� �⺻ �����ڰ� �ƴ϶� String name�� ������ �޴� �������̱� ������
	// �� �⺻ �����ڸ� ȣ���� ��� ������ ��.
}

class Sub5 extends Super5 {
	public Sub5(String name) {
		// super("hong");
		super(name);
		
	}
}

public class SuperSubTest5 {

}
