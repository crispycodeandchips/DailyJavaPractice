package day07;

/* Ŭ���� �޼��� : ���� �޼���, static �޼���
 * �޼��� �̸� �տ� static�� ����
 * static void prt()
 * {
 * 
 * }
 * ����� : Ŭ�����̸�.�޼���();
 * 
 * Ŭ���� �޼��忡 ����� �� �ִ� ����
 * ��������( => �Ű����� ����), Ŭ���������� ��� ����������
 * �ν��Ͻ� ������ ��� �ȵ�!
*/
class Static2 {
	int age; // �������, �ν��Ͻ� ����
	static String addr = "seoul"; // Ŭ��������
	public static void prt(int num) { // Ŭ���� �޼��� // ��������
		String name = "hong"; // ��������
		System.out.println("prt!!!");
		System.out.println(addr);
//		System.out.println(age); // �ν��Ͻ������� ����!
	}
}

public class StaticTest2 {
	public static void main(String[] args) {

		Static2.prt(10);
	}
}
