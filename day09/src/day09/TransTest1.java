package day09;

class Tr1 {
	public void prt() {
		System.out.println("Tr1... prt method");
	}
	public void view() {
		System.out.println("Tr1... view method");
	}
}

class SubTr1 extends Tr1 {
	public void draw() {
		System.out.println("SubTr1... draw");
	}
	@Override
	public void view() {
		super.view();
		System.out.println("SubTr1... view");
	}
	
	public void test() {
		
	}

}

public class TransTest1 {
	public static void main(String[] args) {
//		Tr1 ins = new Tr1();
//		ins.prt();
//		ins.view();
//		System.out.println("========");
//
//		SubTr1 ins2 = new SubTr1();
//		ins2.draw();
//		ins2.view();
//		ins2.prt();
		System.out.println("========");
		
		Tr1 ins3 = new SubTr1();
		
		SubTr1 ins4 = (SubTr1)new Tr1(); // int Long�� ����ó�� Tr1���� SubTr1�� �� Ŀ�� Tr1�� SubTr1�� �� ���. �׷��� ����ȯ.
									// �׷����� java.lang.ClassCastException ������ ��. new�� ���� ���� �ִ� Tr1�̶�.
		                            // ���� ���� Ÿ���� ������ ����ų �� �ִ�(����Ű��)  Ÿ��.
	
	
	}
	
	

}
