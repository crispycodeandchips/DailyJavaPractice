package day10;

public class SuperSubTest1 {
	public static void main(String[] args) {
		
	//	Super1 ins = new Sub1();
//		
//		Super1 ins = new Sub1();
//		
//		ins.prt();
//		ins.view(); // �޼���� Sub1���� �� �������� �׸��� sub1�� Super1�� ���� �����Ƿ� Sub1�� view�� ��.
		//ins.draw(); // -> ins�� Super1�� ����Ű�Ƿ� sub1Ŭ������ ����ִ� draw �޼���� ���Ұ�.
		
		//Sub1 ins2 = (Sub1)new Super1(); // ����ĳ����
		// ClasCastException // �ڽ��� �θ� ���� �� ����. ������ -> ��� (x)
		// �θ����� ���� ������� �ڻ��� Ȯ���� �������� �ڽ��� ������ ��. (�ڽ� ������ �� ŭ)
		// Ŭ���� ��ȯ ����
		
//		Super1 ins3 = new Sub1();
//		Sub1 ins4 = (Sub1)ins3;
//		
//		ins4.view(); // sub1
//		ins4.prt(); // Super1.prt
//		ins4.draw(); // Sub1.draw
		
//		Super1 ins = new Sub1(); // Super1���� Sub1���� ����ȯ�� �����ϴ�
//		Sub1 ins2 = (Sub1)ins;
		
		Super1 obj1 = new Sub1();
	//	Sub1 obj2 = (Sub1)obj1;
		
		if (obj1 instanceof Sub1) {
			
			Sub1 obj2 = (Sub1) obj1;
			
		}
		
		Super1 ins2 = new Super1();
		if (ins2 instanceof Sub1) {
			Sub1 ins3 = (Sub1) ins2;
			
		}else {
			System.out.println("����ȯ�� �ȵ˴ϴ�.");
		}
		
	}
}
