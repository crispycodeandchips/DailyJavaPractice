package day07;

class Sample1 {
	static {
		System.out.println("static �ʱ�ȭ ���"); 
		//Ŭ���� �ҷ��� �� �� ó�� �ѹ��� �����ϴ� ��
	}
//	{
//		System.out.println("�ʱ�ȭ ���");
//	}

Sample1() {
	System.out.println("������!!!!!");
}

}

public class BlockTest {
	public static void main(String[] args) {
		Sample1 ins = new Sample1();
		Sample1 ins2 = new Sample1();
	}

}
