package day06;

/* ������ �����ε� (Overloading)
 * : Ŭ���� ������ (�ٸ� ������)�����ڸ� ������ ������ ��.
 * 
 * ������ �̸��� ���ƾ�
 * �Ű����� Ÿ��, ����, ������ �ٸ��� �ٸ� �����ڷ� �ν�
*/
	class Person3{
		String name; // �Ű�����
		int age;
		String addr;
		
		Person3(String name, int age, String addr){
			this.name = name; // �������� // this: �������� this
			this.age = age;
			this.addr = addr; //�ڽ��� ��ü�� ����ų �� this�� ���.
		}
		
		// �̸��� ���̸� �ʱ�ȭ �� �����ڸ� �ۼ��Ͻÿ�
		Person3(String name, int age){ // ������
			this.name = name;
			this.age = age;
		}
		
		// �̸��� �ּҸ� �ʱ�ȭ �� �����ڸ� �ۼ��Ͻÿ�.
		Person3(String name, String addr){ // ������
			this.name = name;
			this.addr = addr;
		}
		
		// ��� �޼���
		void print() {
			System.out.println("�̸�: "+name);
			System.out.println("����: "+age);
			System.out.println("�ּ�: "+addr);
		}
	}

public class ConstructorTest3 {

	public static void main(String[] args) {
	
		Person3 ins = new Person3("hong", 20, "seoul");
		ins.print();

	}

}
