package day05;

class Person2 {
	void prt() { // �޼ҵ�
		System.out.println("prt method call");
	}

	void draw(String data) {
		System.out.println(data + "�� �׸��ϴ�");
	}

	void cal(int a, float b, long c, char d, String e)
	// void ���� Ÿ��
	// cal �޼ҵ� ������
	// (  ) �޼ҵ� �ȿ� �� �������� Ÿ�԰� �̸�
	// ����Ÿ�� �޼��� ()
	// a, b, c, d, e, f �Ű�����
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
}
	void think(int num, int num2) {
		System.out.println("num1: "+num+", "+num2);
	}
}

public class MethodTest1 {
	public static void main(String[] args) {
		
		Person2 ins = new Person2();
		ins.prt(); // �޼ҵ� ȣ��
		ins.draw("��");
		ins.cal(10,20.2f,30L,'a',"hong");
		
		int data1 = 10;
		int data2 = 20;
		ins.think(data1, data2);
	}

}
