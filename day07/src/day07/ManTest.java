package day07;
/*
 * �޼��� �����ε�(method overloading)
 * ���� Ŭ���� ������ ���� �̸��� �޼��尡 ������ �ִ� ��.
 * ex) ���� �� �ٸ����� �̸��� ���� �޼���
 * void prt(){}
 * void prt(String name){}
 * void prt(int su){}
 * void prt(String name, String addr){}
 * void prt(String name, int age){}
 * void prt(int age, String name){}
 * 
 * �� �����ε��� �ȵǴ� ���
 * ex) �̸��� ���� �����ε� ���� �޼��� (�� �� ��Ʈ��)
 * void prt(String name, String addr){}
 * void prt(String addr, String name){}
*/

public class ManTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man ins = new Man();
		ins.modify("hong", 20);
		ins.print();

		Man ins2 = new Man();
		System.out.println("======");
		ins2.modify("kim", "seoul");
		ins2.print();
	}

}
