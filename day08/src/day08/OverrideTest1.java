package day08;

/* �޼��� �������̵�(method overriding) : ������
 * 	:��Ӱ��迡�� �θ𿡼� ������ �޼��带 �ڽ�Ŭ�������� �ٽ� ������ ��
 * 	�޼��� �̸��� ���ƾ�, �Ű����� Ÿ��, ����, ������ ���ƾ�
 * 	����Ÿ�Ե� ���ƾ�.. => �޼��� �ñ״��� ���ƾ� 
 * 
 * ���������� ����
 * Exception ����
*/

class Parent1 {
	public void prt() {
		System.out.println("prent-prt method");
	}
}

class Child1 extends Parent1 {
	public void draw() {
		System.out.println("Child1-draw");
	}

	@Override // annotation " ������̼�
	public void prt() // �޼��� �������̵�(method overriding): ������
	{
		System.out.println("hello");
	}
}



public class OverrideTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}
	

}
