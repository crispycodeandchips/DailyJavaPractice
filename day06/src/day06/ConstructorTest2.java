package day06;

/*
 * ������ : ��ü�� ����� �� (constructor)
 * 
 * ������ ����� ���
 * 	Ŭ���� �̸��� ������ �̸��� �޼��� ���, �� ����Ÿ���� ����� ��.
 * 
 * ȣ�� ���� :
 * 	new �� �� �ڵ����� ȣ��
 * 
 * ��� ���� :
 * 	��ü�� �ν��Ͻ� �������� �ʱ�ȭ �ϱ� ����
 * 	��ü�� ��������鼭 �ؾ� �� ���..
*/

class Student2 {
	// ��ü�� ����� ���ؼ��� �ݵ�� �����ڰ� �ʿ��ϴ�.
	// ��ü�� ������� ���� �ݵ�� �ؾ� �� ���� �����ڿ� ���ָ� ��.
	
	Student2(int num1) {
		System.out.println("������ ȣ��:"+num1);
	}
	Student2(){
		System.out.println("������ -no arguement ������"); //arguement : �Ű�����
	}
	Student2(String name){
		System.out.println("������ -�Ű������� String Ÿ��");
	}
}
public class ConstructorTest2 {

	public static void main(String[] args) {
	
		Student2 ins = new Student2(10);
		Student2 ins2 = new Student2();
		Student2 ins3 = new Student2("hong");

	}

}
