package day07;

/*
 * Ŭ���� ����, ���� ����, static ����
 * 
 * ���� : Static Ÿ�� ����;
 * ��� : Ŭ�����̸�.����
 * �޸𸮴� Ŭ���� '�ε���' �޼��� ������ �޸� �Ҵ�
 * �ε� ���� : main Ŭ������ ���� 
*/
class Static1{
	
	static int num = 10; // Ŭ���� ����, ���� ����, static ����
}

public class StaticTest1 {
	public static void main(String[] args) {
		
		Static1 ins = new Static1();
		Static1 ins2 = new Static1();
		Static1 ins3 = new Static1();
		
		ins.num = 10;
		ins2.num = 100;
		ins3.num = 1000;
		
		System.out.println(ins.num);
		System.out.println(ins2.num);
		System.out.println(ins3.num);
		System.out.println(Static1.num);
	}

}
